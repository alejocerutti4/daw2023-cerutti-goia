package ar.edu.utn.frvm.sistemas.daw2023.service;

import ar.edu.utn.frvm.sistemas.daw2023.exception.CustomException;
import ar.edu.utn.frvm.sistemas.daw2023.model.*;
import ar.edu.utn.frvm.sistemas.daw2023.repository.ReservaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class ReservaService implements IReservaService{
    private final ReservaRepository reservaRepository;
    private final IEspacioFisicoService espacioFisicoService;

    private final ISolicitanteService solicitanteService;
    private final IEstadoService estadoService;
    private final IRecursoService recursoService;
    public ReservaService(ReservaRepository reservaRepository, IEspacioFisicoService espacioFisicoService, ISolicitanteService solicitanteService, IEstadoService estadoService, IRecursoService recursoService) {
        this.reservaRepository = reservaRepository;
        this.espacioFisicoService = espacioFisicoService;
        this.solicitanteService = solicitanteService;
        this.estadoService = estadoService;
        this.recursoService = recursoService;

    }


    @Override
    public Reserva getById(Integer id) {
        return reservaRepository.findById(id).orElse(null);
    }

    @Override
    public Reserva add(Reserva reserva) {
        if (estaDisponible(reserva.getEspacioFisico().getId()) && !haySuperposicionHoraria(reserva)) {

            if(reserva.getEstado() != null){
                Estado estado = estadoService.getById(1);
                reserva.setEstado(estado);
            }

            if(reserva.getRecursosSolicitados() != null){
                List<Recurso> recursos = reserva.getRecursosSolicitados().stream().map(recurso -> recursoService.getById(recurso.getId())).collect(Collectors.toList());
                reserva.setRecursosSolicitados(recursos);
            }

            if( reserva.getEspacioFisico() != null) {
                EspacioFisico espacioFisico = espacioFisicoService.getById(reserva.getEspacioFisico().getId());
                reserva.setEspacioFisico(espacioFisico);
            }

            if (reserva.getSolicitante() != null) {
                Solicitante solicitante = solicitanteService.getById(reserva.getSolicitante().getId());
                reserva.setSolicitante(solicitante);
            }

            return reservaRepository.save(reserva);
        } else {
            throw new CustomException(400, "No se pudo realizar la reserva");
        }
    }


    @Override
    public Reserva update(Integer id, Reserva reserva) {
        try {
            reserva.setId(id);
            if (estaDisponible(reserva.getEspacioFisico().getId()) && !haySuperposicionHoraria(reserva)){
                if(reserva.getEstado() != null){
                    Estado estado = estadoService.getById(reserva.getEstado().getId());
                    reserva.setEstado(estado);
                }

                if(reserva.getRecursosSolicitados() != null){
                    List<Recurso> recursos = reserva.getRecursosSolicitados().stream().map(recurso -> recursoService.getById(recurso.getId())).collect(Collectors.toList());
                    reserva.setRecursosSolicitados(recursos);
                }

                if( reserva.getEspacioFisico() != null) {
                    EspacioFisico espacioFisico = espacioFisicoService.getById(reserva.getEspacioFisico().getId());
                    reserva.setEspacioFisico(espacioFisico);
                }

                if (reserva.getSolicitante() != null) {
                    Solicitante solicitante = solicitanteService.getById(reserva.getSolicitante().getId());
                    reserva.setSolicitante(solicitante);
                }

                return reservaRepository.save(reserva);
            }else
                throw new CustomException(400, "No se pudo actualizar la reserva");
        } catch (Exception e) {
            throw new CustomException(400, "No se pudo actualizar la reserva");
        }
    }

    @Override
    public String delete(Integer id) {
        reservaRepository.deleteById(id);
        return "Reserva eliminada con id: " + id + ".";
    }

    @Override
    public List<Reserva> getAll() {
        return reservaRepository.findAll();
    }

    @Override
    public Page<Reserva> getAll(Pageable p) {
        return reservaRepository.findAll(p);
    }

    public boolean estaDisponible(Integer idEspacioFisico){
        if (this.espacioFisicoService.sePuedeReservar(idEspacioFisico)){
            return true;
        }else return false;
    }

    @Override
    public boolean haySuperposicionHoraria(Reserva reserva) {
        List<Reserva> reservasExistentesDelMismoEspacio = this.getByEspacioId(reserva.getEspacioFisico().getId());
        for (Reserva reservaExistente : reservasExistentesDelMismoEspacio) {
            if (reservasSeSuperponen(reserva, reservaExistente) && !Objects.equals(reserva.getId(), reservaExistente.getId())) {
                // Si hay superposición horaria, retorna true
                return true;
            }
        }

        // Si no se encontró superposición con ninguna reserva existente, retorna false
        return false;
    }

    @Override
    public boolean reservasSeSuperponen(Reserva reserva1, Reserva reserva2) {
        // Compara las fechas y horas de inicio y fin de ambas reservas
        if (reserva1.getFechaHoraInicioReserva().isAfter(reserva2.getFechaHoraFinReserva()) ||
                reserva1.getFechaHoraFinReserva().isBefore(reserva2.getFechaHoraInicioReserva())) {
            return false; // No hay superposición
        }
        return true; // Hay superposición
    }

    @Override
    public List<Reserva> getByEspacioId(Integer id){
        return reservaRepository.getReservasByEspacioFisicoId(id);
    }


}

package ar.edu.utn.frvm.sistemas.daw2023.service;

import ar.edu.utn.frvm.sistemas.daw2023.exception.CustomException;
import ar.edu.utn.frvm.sistemas.daw2023.model.Reserva;
import ar.edu.utn.frvm.sistemas.daw2023.repository.ReservaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ReservaService implements IReservaService{
    private final ReservaRepository reservaRepository;
    private final IEspacioFisicoService espacioFisicoService;

    public ReservaService(ReservaRepository reservaRepository, IEspacioFisicoService espacioFisicoService) {
        this.reservaRepository = reservaRepository;
        this.espacioFisicoService = espacioFisicoService;
    }

    @Override
    public Reserva getById(Integer id) {
        return reservaRepository.findById(id).orElse(null);
    }

    @Override
    public Reserva add(Reserva reserva) {
        if (estaDisponible(reserva.getEspacioFisico().getId())){
            return reservaRepository.save(reserva);
        }else throw new CustomException(400,"No se pudo realizar la reserva");
    }

    @Override
    public Reserva update(Integer id, Reserva reserva) {
        reserva.setId(id);
        return reservaRepository.save(reserva);
    }

    @Override
    public String delete(Integer id) {
        reservaRepository.deleteById(id);
        return "Reserva eliminada con id: " + id + ".";
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
}

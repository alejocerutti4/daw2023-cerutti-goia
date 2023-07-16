package ar.edu.utn.frvm.sistemas.daw2023.service;

import ar.edu.utn.frvm.sistemas.daw2023.model.EspacioFisico;
import ar.edu.utn.frvm.sistemas.daw2023.model.Estado;
import ar.edu.utn.frvm.sistemas.daw2023.model.Recurso;
import ar.edu.utn.frvm.sistemas.daw2023.model.Solicitante;
import ar.edu.utn.frvm.sistemas.daw2023.repository.EspacioFisicoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EspacioFisicoService implements IEspacioFisicoService{

    private final EspacioFisicoRepository espacioFisicoRepository;
    private final EstadoService estadoService;
    private final RecursoService recursoService;

    public EspacioFisicoService(EspacioFisicoRepository espacioFisicoRepository, EstadoService estadoService, RecursoService recursoService) {
        this.espacioFisicoRepository = espacioFisicoRepository;
        this.estadoService = estadoService;
        this.recursoService = recursoService;
    }

    @Override
    public Page<EspacioFisico> getAll(Pageable page) {
        return espacioFisicoRepository.findAll(page);
    }

    @Override
    public List<EspacioFisico> getAll() {
        return espacioFisicoRepository.findAll();
    }

    @Override
    public EspacioFisico getById(Integer id) {
        return espacioFisicoRepository.findById(id).orElse(null);
    }

    @Override
    public EspacioFisico add(EspacioFisico espacioFisico) {

        if(espacioFisico.getEstado() != null){
            Estado estado = estadoService.getById(espacioFisico.getEstado().getId());
            espacioFisico.setEstado(estado);
        }

        if (espacioFisico.getRecursos() != null) {
            List<Recurso> recursos = espacioFisico.getRecursos().stream().map(recurso -> recursoService.getById(recurso.getId())).collect(Collectors.toList());
            espacioFisico.setRecursos(recursos);
        }

        return espacioFisicoRepository.save(espacioFisico);
    }

    @Override
    public EspacioFisico update(Integer id, EspacioFisico espacioFisico) {

        // seteo el id por las dudas de que en el recurso no lo tenga y evitar que se haga un post.
        espacioFisico.setId(id);
        if(espacioFisico.getEstado() != null){
            Estado estado = estadoService.getById(espacioFisico.getEstado().getId());
            espacioFisico.setEstado(estado);
        }

        if (espacioFisico.getRecursos() != null) {
            List<Recurso> recursos = espacioFisico.getRecursos().stream().map(recurso -> recursoService.getById(recurso.getId())).collect(Collectors.toList());
            espacioFisico.setRecursos(recursos);
        }

        return espacioFisicoRepository.save(espacioFisico);
    }

    @Override
    public String delete(Integer id) {
        this.espacioFisicoRepository.deleteById(id);
        return "Espacio fisico eliminado con id: " + id + ".";
    }

    @Override
    public Page<EspacioFisico> getFiltroNombre(String nombre, Pageable page) {
        return espacioFisicoRepository.findAllByNombreIgnoreCaseContains(nombre, page);
    }

    @Override
    public Page<EspacioFisico> getFiltroCapacidad(Integer capacidad, Pageable page) {
        return espacioFisicoRepository.findAllByCapacidad(capacidad, page);
    }

    @Override
    public Page<EspacioFisico> getFiltroNombreCapacidad(String nombre, Integer capacidad, Pageable page) {
        return espacioFisicoRepository.findAllByNombreIgnoreCaseAndCapacidad(nombre, capacidad, page);
    }

    @Override
    public boolean sePuedeReservar(Integer id){
        if(this.getById(id).getEstado().getNombre().equals("Habilitado")){
            return true;
        }else return false;
    }
}

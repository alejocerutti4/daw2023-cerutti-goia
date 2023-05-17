package ar.edu.utn.frvm.sistemas.daw2023.service;

import ar.edu.utn.frvm.sistemas.daw2023.model.EspacioFisico;
import ar.edu.utn.frvm.sistemas.daw2023.repository.EspacioFisicoRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EspacioFisicoService implements IEspacioFisicoService{

    private final EspacioFisicoRepository espacioFisicoRepository;

    public EspacioFisicoService(EspacioFisicoRepository espacioFisicoRepository) {
        this.espacioFisicoRepository = espacioFisicoRepository;
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
        return espacioFisicoRepository.save(espacioFisico);
    }

    @Override
    public EspacioFisico update(Integer id, EspacioFisico espacioFisico) {

        // seteo el id por las dudas de que en el recurso no lo tenga y evitar que se haga un post.
        espacioFisico.setId(id);
        // El save funciona como un update si el objeto tiene id, si no tiene el id funciona como un insert
        return this.espacioFisicoRepository.save(espacioFisico);
    }

    @Override
    public String delete(Integer id) {
        this.espacioFisicoRepository.deleteById(id);
        return "Espacio fisico eliminado con id: " + id + ".";
    }

    @Override
    public Iterable<EspacioFisico> getFiltroNombre(String nombre, Pageable p) {
        return espacioFisicoRepository.findAllByNombreIgnoreCaseContains(nombre, p);
    }

    @Override
    public List<EspacioFisico> getFiltroCapacidad(Integer capacidad) {
        return espacioFisicoRepository.findAllByCapacidad(capacidad);
    }

    @Override
    public List<EspacioFisico> getFiltroNombreCapacidad(String nombre, Integer capacidad) {
        return espacioFisicoRepository.findAllByNombreIgnoreCaseAndCapacidad(nombre, capacidad);
    }
}

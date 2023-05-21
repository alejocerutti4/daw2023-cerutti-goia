package ar.edu.utn.frvm.sistemas.daw2023.service;

import ar.edu.utn.frvm.sistemas.daw2023.model.Estado;
import ar.edu.utn.frvm.sistemas.daw2023.repository.EstadoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoService implements IEstadoService{

    private final EstadoRepository estadoRepository;

    public EstadoService(EstadoRepository estadoRepository) {
        this.estadoRepository = estadoRepository;
    }

    @Override
    public Estado getById(Integer id) {
        return this.estadoRepository.findById(id).orElse(null);
    }

    @Override
    public Estado add(Estado estado) {
        return this.estadoRepository.save(estado);
    }

    @Override
    public Estado update(Integer id, Estado estado) {
        estado.setId(id);
        return this.estadoRepository.save(estado);
    }

    @Override
    public String delete(Integer id) {
        this.estadoRepository.deleteById(id);
        return "Espacio fisico eliminado con id: " + id + ".";
    }

    @Override
    public Page<Estado> getAll(Pageable page) {
        return this.estadoRepository.findAll(page);
    }
}

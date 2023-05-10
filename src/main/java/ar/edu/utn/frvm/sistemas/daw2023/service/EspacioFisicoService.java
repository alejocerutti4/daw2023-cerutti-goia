package ar.edu.utn.frvm.sistemas.daw2023.service;

import ar.edu.utn.frvm.sistemas.daw2023.model.EspacioFisico;
import ar.edu.utn.frvm.sistemas.daw2023.repository.EspacioFisicoRepository;
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
        EspacioFisico espacioFisicoToUpdate = this.espacioFisicoRepository.findById(id).orElse(null);

        if(espacioFisicoToUpdate != null){
            espacioFisicoToUpdate.setNombre(espacioFisico.getNombre());
            espacioFisicoToUpdate.setDescripcion(espacioFisico.getDescripcion());
            espacioFisicoToUpdate.setCapacidad(espacioFisico.getCapacidad());
            espacioFisicoToUpdate.setRecursos(espacioFisico.getRecursos());
            espacioFisicoToUpdate.setEstado(espacioFisico.getEstado());
            return this.espacioFisicoRepository.save(espacioFisicoToUpdate);
        }
        return null;
    }

    @Override
    public String delete(Integer id) {
        this.espacioFisicoRepository.deleteById(id);
        return "Espacio fisico eliminado con id: " + id + ".";
    }
}

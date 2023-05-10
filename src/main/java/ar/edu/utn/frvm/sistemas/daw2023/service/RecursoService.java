package ar.edu.utn.frvm.sistemas.daw2023.service;

import ar.edu.utn.frvm.sistemas.daw2023.model.Recurso;
import ar.edu.utn.frvm.sistemas.daw2023.repository.RecursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecursoService implements IRecursoService{

    private final RecursoRepository recursoRepository;

    public RecursoService(RecursoRepository recursoRepository) {
        this.recursoRepository = recursoRepository;
    }
    public List<Recurso> getAll() {

        return this.recursoRepository.findAll();
    }

    public Recurso getById(Integer id) {
        return this.recursoRepository.findById(id).orElse(null);
    }

    public Recurso add(Recurso recurso) {
        return this.recursoRepository.save(recurso);
    }

    public Recurso update(Integer id, Recurso recurso) {

        Recurso recursoToUpdate = this.recursoRepository.findById(id).orElse(null);

        if(recursoToUpdate != null){
            recursoToUpdate.setNombre(recurso.getNombre());
            recursoToUpdate.setDescripcion(recurso.getDescripcion());
            return this.recursoRepository.save(recursoToUpdate);
        }
        return null;
    }

    public String delete(Integer id) {
        this.recursoRepository.deleteById(id);
        return "Recurso eliminado con id: " + id + ".";
    }
}

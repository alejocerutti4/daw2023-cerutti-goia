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

        // seteo el id por las dudas de que en el recurso no lo tenga y evitar que se haga un post.
        recurso.setId(id);
        // El save funciona como un update si el objeto tiene id, si no tiene el id funciona como un insert
        return this.recursoRepository.save(recurso);
    }

    public String delete(Integer id) {
        this.recursoRepository.deleteById(id);
        return "Recurso eliminado con id: " + id + ".";
    }
}

package ar.edu.utn.frvm.sistemas.daw2023.controller;

import ar.edu.utn.frvm.sistemas.daw2023.model.Recurso;
import ar.edu.utn.frvm.sistemas.daw2023.exception.CustomException;
import ar.edu.utn.frvm.sistemas.daw2023.service.IRecursoService;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;



import java.util.List;

@RestController
@RequestMapping("/recursos/")
public class RecursoController {

    private final IRecursoService recursoService;

    public RecursoController(IRecursoService recursoService) {
        this.recursoService = recursoService;
    }
    // get all method
    @GetMapping
    public List<Recurso> getAll() {
        return this.recursoService.getAll();
    }

    // get one method
    @GetMapping("/{id}")
    public Recurso getById(@PathVariable("id") Integer id) throws CustomException {
        try {
            return this.recursoService.getById(id);
        } catch (Exception e) {
            throw new CustomException(404, "Recurso no encontrado");
        }
    }

    @GetMapping(params="page")
    public Iterable<Recurso> getAllPaginado(@RequestParam Pageable p) {
        return this.recursoService.getAllPaginado(p);
    }

    @PostMapping
    public Recurso add(@RequestBody Recurso recurso) {
        return this.recursoService.add(recurso);
    }

    @PutMapping("/{id}")
    public Recurso update(@PathVariable("id") Integer id, @RequestBody Recurso recurso) {
        return this.recursoService.update(id, recurso);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Integer id) {
        return this.recursoService.delete(id);
    }

}

package ar.edu.utn.frvm.sistemas.daw2023.controller;

import ar.edu.utn.frvm.sistemas.daw2023.exception.CustomException;
import ar.edu.utn.frvm.sistemas.daw2023.model.Estado;
import ar.edu.utn.frvm.sistemas.daw2023.service.IEstadoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estados/")
@CrossOrigin(origins = "*")
public class EstadoController {
    private final IEstadoService estadoService;


    public EstadoController(IEstadoService estadoService) {
        this.estadoService = estadoService;
    }

    @GetMapping
    public Page<Estado> getAll(Pageable page){
        return this.estadoService.getAll(page);
    }

    @GetMapping("/{id}")
    public Estado getById(@PathVariable Integer id) {
        try {
            return this.estadoService.getById(id);
        } catch (Exception e) {
            throw new CustomException(404, "Estado no encontrado");
        }
    }

    @PostMapping
    public Estado add(@RequestBody Estado estado){
        return this.estadoService.add(estado);
    }

    @PutMapping("/{id}")
    public Estado update(@PathVariable Integer id, @RequestBody Estado estado){
        return this.estadoService.update(id, estado);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        return this.estadoService.delete(id);
    }

}

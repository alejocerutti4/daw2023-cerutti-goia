package ar.edu.utn.frvm.sistemas.daw2023.controller;

import ar.edu.utn.frvm.sistemas.daw2023.model.EspacioFisico;
import ar.edu.utn.frvm.sistemas.daw2023.service.IEspacioFisicoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/espaciosFisicos/")
public class EspacioFisicoController {
    private final IEspacioFisicoService espacioFisicoService;

    public EspacioFisicoController(IEspacioFisicoService espacioFisicoService) {
        this.espacioFisicoService = espacioFisicoService;
    }

    @GetMapping
    public Page<EspacioFisico> getAll(Pageable page){
        return this.espacioFisicoService.getAll(page);
    }

    @GetMapping("/{id}")
    public EspacioFisico getById(@PathVariable Integer id){
        return this.espacioFisicoService.getById(id);
    }

    @GetMapping(value = "/search", params = {"nombre", "page"})
    public Page<EspacioFisico> getFiltroNombre(Pageable page, @RequestParam(name="nombre",required=true) String nombre){
        return this.espacioFisicoService.getFiltroNombre(nombre, page);
    }

    @GetMapping(value = "/search", params = {"capacidad", "page"})
    public Page<EspacioFisico> getFiltroCapacidad(Pageable page, @RequestParam(required=true) Integer capacidad){
        return this.espacioFisicoService.getFiltroCapacidad(capacidad, page);
    }

    @GetMapping(value = "/search", params = {"nombre", "capacidad", "page"})
    public Page<EspacioFisico> getFiltroNombreCapacidad(Pageable page, @RequestParam(name = "nombre", required=true) String nombre, @RequestParam(name = "capacidad", required=true) Integer capacidad){
        return this.espacioFisicoService.getFiltroNombreCapacidad(nombre, capacidad, page);
    }

    @PostMapping
    public EspacioFisico add(@RequestBody EspacioFisico espacioFisico){
        return this.espacioFisicoService.add(espacioFisico);
    }

    @PutMapping("/{id}")
    public EspacioFisico update(@PathVariable Integer id, @RequestBody EspacioFisico espacioFisico){
        return this.espacioFisicoService.update(id, espacioFisico);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        return this.espacioFisicoService.delete(id);
    }
}

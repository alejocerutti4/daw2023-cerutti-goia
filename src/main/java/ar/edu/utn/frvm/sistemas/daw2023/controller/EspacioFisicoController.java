package ar.edu.utn.frvm.sistemas.daw2023.controller;

import ar.edu.utn.frvm.sistemas.daw2023.model.EspacioFisico;
import ar.edu.utn.frvm.sistemas.daw2023.service.IEspacioFisicoService;
import org.aspectj.apache.bcel.generic.RET;
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
    public List<EspacioFisico> getAll(){
        return this.espacioFisicoService.getAll();
    }

    @GetMapping("/{id}")
    public EspacioFisico getById(@PathVariable Integer id){
        return this.espacioFisicoService.getById(id);
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

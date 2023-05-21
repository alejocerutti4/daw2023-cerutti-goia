package ar.edu.utn.frvm.sistemas.daw2023.controller;

import ar.edu.utn.frvm.sistemas.daw2023.exception.CustomException;
import ar.edu.utn.frvm.sistemas.daw2023.model.Solicitante;
import ar.edu.utn.frvm.sistemas.daw2023.service.ISolicitanteService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/solicitantes/")
public class SolicitanteController {

    private final ISolicitanteService solicitanteService;
    public SolicitanteController(ISolicitanteService solicitanteService){
        this.solicitanteService = solicitanteService;
    }
    @GetMapping
    public Page<Solicitante> getAll(Pageable page){
        return this.solicitanteService.getAllPaginado(page);
    }

    @GetMapping("/{id}")
    public Solicitante getById(@PathVariable Integer id)throws CustomException {
        try {
            return this.solicitanteService.getById(id);
        } catch (Exception e) {
            throw new CustomException(404, "Solicitante no encontrado");
        }
    }
    @PostMapping
    public Solicitante add(@RequestBody Solicitante solicitante) {
        return this.solicitanteService.add(solicitante);
    }

    @PutMapping("/{id}")
    public Solicitante update(@PathVariable Integer id, @RequestBody Solicitante solicitante){
        return this.solicitanteService.update(id, solicitante);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        return this.solicitanteService.delete(id);
    }
}

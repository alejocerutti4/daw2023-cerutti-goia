package ar.edu.utn.frvm.sistemas.daw2023.controller;

import ar.edu.utn.frvm.sistemas.daw2023.exception.CustomException;
import ar.edu.utn.frvm.sistemas.daw2023.model.Rol;
import ar.edu.utn.frvm.sistemas.daw2023.service.IRolService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;



import java.util.List;

@RestController
@RequestMapping("/roles/")
@CrossOrigin(origins = "*")
public class RolController {

    private final IRolService rolService;

    public RolController(IRolService rolService) {
        this.rolService = rolService;
    }

    // get all method
    @GetMapping
    public Page<Rol> getAll(Pageable p) {
        return this.rolService.getAll(p);
    }
    // get one method
    @GetMapping("/{id}")
    public Rol getById(@PathVariable("id") Integer id) throws CustomException {
        try {
            return this.rolService.getById(id);
        } catch (Exception e) {
            throw new CustomException(404, "Rol no encontrado");
        }
    }
    @PostMapping
    public Rol add(@RequestBody Rol rol) {
        return this.rolService.add(rol);
    }

    @PutMapping("/{id}")
    public Rol update(@PathVariable("id") Integer id, @RequestBody Rol rol) {
        return this.rolService.update(id, rol);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Integer id) {
        return this.rolService.delete(id);
    }

}


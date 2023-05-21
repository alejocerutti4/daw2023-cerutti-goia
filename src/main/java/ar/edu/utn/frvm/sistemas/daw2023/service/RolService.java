package ar.edu.utn.frvm.sistemas.daw2023.service;

import ar.edu.utn.frvm.sistemas.daw2023.model.Rol;
import ar.edu.utn.frvm.sistemas.daw2023.repository.RolRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolService implements IRolService{

    private final RolRepository rolRepository;

    public RolService(RolRepository rolRepository){
        this.rolRepository = rolRepository;
    }

    @Override
    public Rol add(Rol entity) {
        return rolRepository.save(entity);
    }

    @Override
    public Rol getById(Integer id) {
        return rolRepository.findById(id).orElse(null);
    }

    @Override
    public String delete(Integer id) {
        rolRepository.deleteById(id);
        return "Rol eliminado con id: " + id + ".";
    }

    @Override
    public Rol update(Integer id, Rol rol) {
        rol.setId(id);
        return rolRepository.save(rol);
    }

    @Override
    public Page<Rol> getAll(Pageable p) {
        return rolRepository.findAll(p);
    }

}

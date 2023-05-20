package ar.edu.utn.frvm.sistemas.daw2023.service;

import ar.edu.utn.frvm.sistemas.daw2023.model.Rol;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IRolService extends IService<Rol> {
    Page<Rol> getAllPaginado(Pageable p);

}

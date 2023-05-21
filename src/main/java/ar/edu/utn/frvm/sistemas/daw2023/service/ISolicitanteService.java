package ar.edu.utn.frvm.sistemas.daw2023.service;

import ar.edu.utn.frvm.sistemas.daw2023.model.Solicitante;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ISolicitanteService extends IService<Solicitante>{
    public Page<Solicitante> getAllPaginado(Pageable page);
}

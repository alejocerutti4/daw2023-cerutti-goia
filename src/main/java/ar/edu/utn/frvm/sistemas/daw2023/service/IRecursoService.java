package ar.edu.utn.frvm.sistemas.daw2023.service;

import ar.edu.utn.frvm.sistemas.daw2023.model.Recurso;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface IRecursoService extends IService<Recurso>{
    List<Recurso> getAll();
}

package ar.edu.utn.frvm.sistemas.daw2023.service;

import ar.edu.utn.frvm.sistemas.daw2023.model.EspacioFisico;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IEspacioFisicoService extends IService<EspacioFisico>{
    public Page<EspacioFisico> getFiltroNombre(String nombre, Pageable page);
    public Page<EspacioFisico> getFiltroCapacidad(Integer capacidad, Pageable page);

    public Page<EspacioFisico> getFiltroNombreCapacidad(String nombre, Integer capacidad, Pageable page);
    public boolean sePuedeReservar(Integer id);
    public List<EspacioFisico> getAll();
}

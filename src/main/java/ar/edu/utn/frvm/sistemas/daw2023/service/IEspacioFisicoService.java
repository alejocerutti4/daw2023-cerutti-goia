package ar.edu.utn.frvm.sistemas.daw2023.service;

import ar.edu.utn.frvm.sistemas.daw2023.model.EspacioFisico;

import java.util.List;

public interface IEspacioFisicoService extends IService<EspacioFisico>{
    public List<EspacioFisico> getFiltroNombre(String nombre);
    public List<EspacioFisico> getFiltroCapacidad(Integer capacidad);

    public List<EspacioFisico> getFiltroNombreCapacidad(String nombre, Integer capacidad);
}

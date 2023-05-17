package ar.edu.utn.frvm.sistemas.daw2023.repository;

import ar.edu.utn.frvm.sistemas.daw2023.model.EspacioFisico;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EspacioFisicoRepository extends JpaRepository<EspacioFisico, Integer> {
    List<EspacioFisico> findAllByNombre(String nombre);
    List<EspacioFisico> findAllByNombreIgnoreCase(String nombre, Pageable page);
    Page<EspacioFisico> findAllByNombreIgnoreCaseContains(String nombre, Pageable page);

    Page<EspacioFisico> findAllByCapacidad(Integer capacidad, Pageable page);

    Page<EspacioFisico> findAllByNombreIgnoreCaseAndCapacidad(String nombre, Integer capacidad, Pageable page);
}

package ar.edu.utn.frvm.sistemas.daw2023.repository;

import ar.edu.utn.frvm.sistemas.daw2023.model.EspacioFisico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspacioFisicoRepository extends JpaRepository<EspacioFisico, Integer> {
}

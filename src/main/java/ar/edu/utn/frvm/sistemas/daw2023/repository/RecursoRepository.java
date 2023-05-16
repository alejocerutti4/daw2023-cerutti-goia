package ar.edu.utn.frvm.sistemas.daw2023.repository;

import ar.edu.utn.frvm.sistemas.daw2023.model.Recurso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecursoRepository extends JpaRepository<Recurso, Integer> {

}

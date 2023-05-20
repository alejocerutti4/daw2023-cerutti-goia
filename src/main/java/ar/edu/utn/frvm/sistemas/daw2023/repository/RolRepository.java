package ar.edu.utn.frvm.sistemas.daw2023.repository;

import ar.edu.utn.frvm.sistemas.daw2023.model.Recurso;
import ar.edu.utn.frvm.sistemas.daw2023.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{
}

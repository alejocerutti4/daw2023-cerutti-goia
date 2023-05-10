package ar.edu.utn.frvm.sistemas.daw2023.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class EspacioFisico extends ObjectoDB{
    private String nombre;
    private String descripcion;
    private Integer capacidad;

    @ManyToMany
    private List<Recurso> recursos;

    @ManyToOne
    private EstadoEspacioFisico estado;
}

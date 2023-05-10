package ar.edu.utn.frvm.sistemas.daw2023.model;

import jakarta.persistence.Entity;
import lombok.*;

@Entity(name = "estado_espacio_compartido")
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class EstadoEspacioFisico extends ObjectoDB{
    private String nombre;
}

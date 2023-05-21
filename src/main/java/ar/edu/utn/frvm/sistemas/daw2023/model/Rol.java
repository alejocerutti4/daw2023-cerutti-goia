package ar.edu.utn.frvm.sistemas.daw2023.model;

import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "rol")
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Rol extends ObjectoDB {
    private String nombre;
    private String descripcion;
    private String color;

}

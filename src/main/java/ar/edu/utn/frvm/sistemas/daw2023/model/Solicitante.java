package ar.edu.utn.frvm.sistemas.daw2023.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "solicitante")
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Solicitante extends ObjectoDB{
    private String nombre;
    private String apellido;
    @Column(name = "nro_telefono")
    private String nroTelefono;
    private String email;
    private int legajo;
    @ManyToOne
    private Rol rol;
}

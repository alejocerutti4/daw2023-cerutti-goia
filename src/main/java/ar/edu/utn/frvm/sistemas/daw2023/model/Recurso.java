package ar.edu.utn.frvm.sistemas.daw2023.model;


import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@RequiredArgsConstructor
@AllArgsConstructor
public class Recurso extends ObjectoDB{
    @NonNull
    private String nombre;
    private String descripcion;
}

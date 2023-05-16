package ar.edu.utn.frvm.sistemas.daw2023.model;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.*;

@MappedSuperclass
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@AllArgsConstructor
public class ObjectoDB {
    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
}

package ar.edu.utn.frvm.sistemas.daw2023.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity(name = "reserva")
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Reserva extends ObjectoDB{
    private LocalDateTime fechaHoraCreacionReserva;
    private LocalDateTime fechaHoraInicioReserva;
    private LocalDateTime fechaHoraFinReserva;
    private String comentario;
    private String motivoReserva;
    private String motivoRechazo;
    private int cantidadPersonas;

    @ManyToOne
    private Solicitante solicitante;

    @ManyToOne
    private EspacioFisico espacioFisico;

    @ManyToOne
    private Estado estado;

}

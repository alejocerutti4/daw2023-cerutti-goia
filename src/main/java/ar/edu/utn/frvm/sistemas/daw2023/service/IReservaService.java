package ar.edu.utn.frvm.sistemas.daw2023.service;

import ar.edu.utn.frvm.sistemas.daw2023.model.Reserva;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IReservaService extends IService<Reserva> {
    List<Reserva> getAll();
    boolean haySuperposicionHoraria(Reserva reserva);
    boolean reservasSeSuperponen(Reserva reserva1, Reserva reserva2);
    List<Reserva> getByEspacioId(Integer id);

}

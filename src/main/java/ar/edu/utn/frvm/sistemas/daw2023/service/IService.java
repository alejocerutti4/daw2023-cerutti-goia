package ar.edu.utn.frvm.sistemas.daw2023.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IService<T> {
    T getById(Integer id);
    T add(T t);
    T update(Integer id, T t);
    String delete(Integer id);
    Page<T> getAll(Pageable p);
}

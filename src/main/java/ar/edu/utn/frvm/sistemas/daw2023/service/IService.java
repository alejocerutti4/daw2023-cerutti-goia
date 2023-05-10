package ar.edu.utn.frvm.sistemas.daw2023.service;

import java.util.List;

public interface IService<T> {
    List<T> getAll();
    T getById(Integer id);
    T add(T t);
    T update(Integer id, T t);
    String delete(Integer id);
}

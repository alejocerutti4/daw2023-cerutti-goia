package ar.edu.utn.frvm.sistemas.daw2023.service;

import ar.edu.utn.frvm.sistemas.daw2023.model.Recurso;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

public interface IRecursoService {
    // getAll return an array list of Recurso, so we need to import the class


    public ArrayList<Recurso> getAll();

    // getOne return a Recurso, so we need to import the class
    public Recurso getById(Integer id);


    Recurso add(Recurso recurso);

    Recurso update(Integer id, Recurso recurso);

    String delete(Integer id);

}

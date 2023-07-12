package ar.edu.utn.frvm.sistemas.daw2023.service;

import ar.edu.utn.frvm.sistemas.daw2023.model.Solicitante;
import ar.edu.utn.frvm.sistemas.daw2023.repository.SolicitanteRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SolicitanteService implements ISolicitanteService{

    private final SolicitanteRepository solicitanteRepository;

    public SolicitanteService(SolicitanteRepository solicitanteRepository) {
        this.solicitanteRepository = solicitanteRepository;
    }

    @Override
    public Solicitante getById(Integer id) {
        return solicitanteRepository.findById(id).orElse(null);
    }

    @Override
    public Solicitante add(Solicitante solicitante) {
        return this.solicitanteRepository.save(solicitante);
    }

    @Override
    public Solicitante update(Integer id, Solicitante solicitante) {
        solicitante.setId(id);
        return this.solicitanteRepository.save(solicitante);
    }

    @Override
    public String delete(Integer id) {
        this.solicitanteRepository.deleteById(id);
        return "Solicitante eliminado con id: " + id + ".";
    }

    @Override
    public Page<Solicitante> getAll(Pageable page) {
        return this.solicitanteRepository.findAll(page);
    }
    @Override
    public List<Solicitante> getAll() {
        return this.solicitanteRepository.findAll();
    }
}

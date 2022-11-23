package com.quickproblem.service;

import com.quickproblem.modelo.Problematecnico;
import com.quickproblem.repository.ProblemaTecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProblematecnicoService {
    @Autowired
    private ProblemaTecnicoRepository problemaTecnicoRepository;

    public void salvarProblematecnicoService(Problematecnico problematecnico) {
        problemaTecnicoRepository.save(problematecnico);
    }

    public Optional<Problematecnico> buscarProblemaTecnico (String Id) {
            return ProblemaTecnicoRepository.findById (Id);
    }

    public boolean excluirProblemaTecnico(String id) {
        Optional<Problematecnico> problematecnico = ProblemaTecnicoRepository.findById(id);
        if (problematecnico != null) {
            ProblemaTecnicoRepository.delete(problematecnico);
            return true;
        }
        return false;
    }

    public List<Problematecnico> listar() {
        return null;
    }

    public boolean atualizarProblemaTecnico(String id, Problematecnico problematecnico) {
        return false;
    }
}

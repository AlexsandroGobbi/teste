package com.quickproblem.service;

import com.quickproblem.modelo.Equipe;
import com.quickproblem.modelo.Operador;
import com.quickproblem.repository.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipeService {
    @Autowired
    private EquipeRepository equipeRepository;

    public void salvarEquipe (Equipe equipe) {
        equipeRepository.save(equipe);
    }

    public Equipe buscarEquipe(String nome) {
        return equipeRepository.findByNome(nome);
    }

    public Equipe buscaEquipeNome(String nome) {
        return equipeRepository.findByNome(nome);
    }

    public boolean excluirEquipe (String nome) {
        Equipe equipe = equipeRepository.findByNome(nome);
        if (nome != null) {
            equipeRepository.delete(nome);
            return true;
        }
        return false;
    }

    public List<Equipe> listar() {
        return null;
    }

    public boolean atualizarEquipe(String nome, Equipe equipe) {
        return false;
    }
}

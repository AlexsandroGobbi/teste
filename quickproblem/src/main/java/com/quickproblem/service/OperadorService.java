package com.quickproblem.service;

import com.quickproblem.modelo.Operador;
import com.quickproblem.repository.OperadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperadorService {
    @Autowired
    private OperadorRepository operadorRepository;

    public void salvarOperador(Operador operador) {
        operadorRepository.save(operador);
    }

    public Operador buscarOperador(String funcional) {
        return operadorRepository.findByFuncional(funcional);
    }

    public Operador buscaOperadorFuncional(String funcional) {
        return operadorRepository.findByFuncional(funcional);
    }

    public boolean excluirOperador(String funcional) {
        Operador operador = operadorRepository.findByFuncional(funcional);
        if (operador != null) {
            operadorRepository.delete(operador);
            return true;
        }
        return false;
    }

    public boolean atualizarOperador(String Funcional, Operador operador) {
        Operador operador1DB = operadorRepository.findByFuncional(Funcional);
        if (operador != null) {
            operador1DB.setNome(operador.getNome());
            operador1DB.setFuncional(operador.getFuncional());
            operadorRepository.save(operador1DB);
            return true;
        }
        return false;
    }

    public List<Operador> listar() {
        return null;
    }
}

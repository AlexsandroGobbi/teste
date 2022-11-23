package com.quickproblem.controller;

import com.quickproblem.modelo.Equipe;
import com.quickproblem.modelo.Operador;
import com.quickproblem.service.OperadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/operador")
public class OperadorController {

    @Autowired
    private OperadorService operadorService;

    @GetMapping
    public List<Operador> listarOperador (){
        return operadorService.listar();
    }

    @PostMapping
    public String cadastrarOperador (@RequestBody Operador operador){
        if (operador.getId() == null){
            return "Id obrigatório";
        }
        if (operador.getNome() == null) {
            return "Nome é obrigatório";
        }
        if (operador.getFuncional() == null) {
            return "Funcional é obrigatório";
        }
        operadorService.salvarOperador(operador);
        return "Operador cadastrado com sucesso";
    }
    @DeleteMapping("/excluiOperador")
    public String deletarOperador(@PathVariable String funcional) {
        boolean deletou = operadorService.excluirOperador(funcional);
        if (deletou) {
            return "Operador excluído com sucesso!";
        }
        return "Operador não encontrado.";
    }
    @PutMapping("/Operador")
    public String atualizarOperador(@PathVariable String funcional, @RequestBody Operador operador) {
        boolean atualizou = operadorService.atualizarOperador(funcional, operador);
        if (atualizou) {
            return "Operador atualizado com sucesso";
        }
        return "Operador não encontrado.";
    }

}

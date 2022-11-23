package com.quickproblem.controller;

import com.quickproblem.modelo.Equipe;
import com.quickproblem.service.EquipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipe")
public class EquipeController {
    @Autowired
    private EquipeService equipeService;

    @GetMapping
    public List<Equipe> listarEquipe (){
        return equipeService.listar();
    }

    @PostMapping
    public String cadastrarEquipe (@RequestBody Equipe equipe){
        if (equipe.getNome() == null){
            return "Nome obrigatório";
        }
        equipeService.salvarEquipe(equipe);
        return "Equipe cadastrada com sucesso";
    }

}

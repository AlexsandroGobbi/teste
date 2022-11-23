package com.quickproblem.controller;

import com.quickproblem.modelo.Problematecnico;
import com.quickproblem.service.ProblematecnicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/problemaTecnico")
public class ProblemaTecnicoController {

    @Autowired
    private ProblematecnicoService problematecnicoService;

    @GetMapping
    public List<Problematecnico> listarProblemaTecnico (){
        return problematecnicoService.listar();
    }

    @PostMapping
    public String cadastrarProblemaTecnico (@RequestBody Problematecnico problematecnico){
        if (problematecnico.getId() == null){
            return "Id obrigatório";
        }
        if (problematecnico.getSituacao() == null) {
            return "Situação é obrigatório";
        }
        if (problematecnico.getLigacaoInterrompidaComOClienteEmLinha() == null) {
            return "Ligacao interrompida Com o Cliente em Linha é obrigatório";
        }
        if (problematecnico.getData() == null) {
            return "Data é obrigatório";
        }
        if (problematecnico.getHoraSaida() == null) {
            return "Hora de Saída é obrigatório";
        }
        if (problematecnico.getHoraRetorno() == null) {
            return "Hora de Retorno é obrigatório";
        }
        if (problematecnico.getPrecisouDeslogarDoGeo() == null) {
            return "Precisou deslogar do GEO é obrigatório";
        }
        if (problematecnico.getSupervisorQueEstaAcompanhandoPT() == null) {
            return "Qual supervisor esta acompanhando é obrigatório";
        }
        if (problematecnico.getHomeOfficeOuCentral() == null) {
            return "HomeOffice ou Central é obrigatório";
        }
        problematecnicoService.salvarProblematecnicoService (problematecnico);
        return "Problema Tecnico cadastrado com sucesso";
    }

}

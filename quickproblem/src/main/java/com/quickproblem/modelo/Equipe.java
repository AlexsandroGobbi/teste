package com.quickproblem.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Equipe {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //- Qual equipe;
}

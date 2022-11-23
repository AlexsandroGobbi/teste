package com.quickproblem.repository;

import com.quickproblem.modelo.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipeRepository extends JpaRepository<Equipe,Long> {
    Equipe findByNome (String nome) ;

    void delete(String nome);
}

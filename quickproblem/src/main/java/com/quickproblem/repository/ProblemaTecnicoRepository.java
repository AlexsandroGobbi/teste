package com.quickproblem.repository;

import com.quickproblem.modelo.Problematecnico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProblemaTecnicoRepository extends JpaRepository <Problematecnico, Long> {
    static Optional<Problematecnico> findById(String id) {
        return null;
    }

    static void delete(Optional<Problematecnico> problematecnico) {
    }
}

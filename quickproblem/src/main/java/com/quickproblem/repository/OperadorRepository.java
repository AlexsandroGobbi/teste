package com.quickproblem.repository;

import com.quickproblem.modelo.Operador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperadorRepository extends JpaRepository<Operador,Long> {
    Operador findByFuncional (String funcional);

}

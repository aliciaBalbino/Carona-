package com.example.exercicio10sd.repository;

import com.example.exercicio10sd.model.Carona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


    @Repository
    public interface CaronaRepository extends JpaRepository<Carona, Long>{
// Aqui o JPA já nos dá: salvar, deletar, buscar todos, etc.

    }


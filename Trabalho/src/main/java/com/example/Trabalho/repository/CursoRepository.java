package com.example.Trabalho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Trabalho.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>{

}


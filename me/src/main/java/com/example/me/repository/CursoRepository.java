package com.example.me.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.me.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>{

}

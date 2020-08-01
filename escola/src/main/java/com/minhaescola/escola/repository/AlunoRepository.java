package com.minhaescola.escola.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaescola.escola.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
	
	public List<Aluno> findAllByCategoriaContainingIgnoreCase(String categoria);

}

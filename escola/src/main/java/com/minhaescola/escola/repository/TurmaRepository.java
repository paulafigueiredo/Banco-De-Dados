package com.minhaescola.escola.repository;

import com.minhaescola.escola.model.Turma;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long>{
	
	public List<Turma>findAllByTurmaContainingIgnoreCase (String turma);
	
}

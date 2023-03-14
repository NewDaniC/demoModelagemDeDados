package com.danielcosta.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielcosta.cursomc.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
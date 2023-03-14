package com.danielcosta.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielcosta.cursomc.domain.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
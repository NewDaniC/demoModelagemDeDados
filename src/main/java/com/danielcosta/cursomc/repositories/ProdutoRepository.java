package com.danielcosta.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielcosta.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
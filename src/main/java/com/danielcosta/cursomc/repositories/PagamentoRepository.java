package com.danielcosta.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielcosta.cursomc.domain.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
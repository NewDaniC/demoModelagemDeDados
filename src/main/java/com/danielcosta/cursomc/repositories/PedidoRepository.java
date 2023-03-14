package com.danielcosta.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielcosta.cursomc.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
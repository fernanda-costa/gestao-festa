package com.fernanda.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernanda.festa.model.Convidado;

public interface ConvidadosRepository extends JpaRepository<Convidado, Long> {

}

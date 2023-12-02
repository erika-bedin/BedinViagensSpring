package com.bedinviagens.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bedinviagens.entidades.Mensagem;

public interface MensagemRepository extends JpaRepository<Mensagem, Integer> {

}
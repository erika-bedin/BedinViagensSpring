package com.bedinviagens.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bedinviagens.model.Mensagem;

public interface MensagemRepository extends JpaRepository<Mensagem, Integer> {

}
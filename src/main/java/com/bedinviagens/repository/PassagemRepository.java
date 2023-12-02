package com.bedinviagens.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bedinviagens.entidades.Passagem;

public interface PassagemRepository extends JpaRepository<Passagem, Integer> {

}
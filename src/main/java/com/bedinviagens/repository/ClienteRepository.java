package com.bedinviagens.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bedinviagens.entidades.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
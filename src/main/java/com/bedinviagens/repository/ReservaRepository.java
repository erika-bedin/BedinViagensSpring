package com.bedinviagens.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bedinviagens.entidades.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {	

}
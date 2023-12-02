package com.bedinviagens.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bedinviagens.model.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {	

}
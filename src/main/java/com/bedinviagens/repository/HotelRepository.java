package com.bedinviagens.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bedinviagens.entidades.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {

}
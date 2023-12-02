package com.bedinviagens.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "Pacote")
public class Pacote {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String destino;
    private String descricao;
    private Date dataPartida;
    private Date dataRetorno;
    private String nomeHotel;
    private double valor;

    // Construtores, getters e setters

    public Pacote() {
    }

    public Pacote(int id, String destino, String descricao, Date dataPartida, Date dataRetorno, String nomeHotel, double valor) {
        this.id = id;
        this.destino = destino;
        this.descricao = descricao;
        this.dataPartida = dataPartida;
        this.dataRetorno = dataRetorno;
        this.nomeHotel = nomeHotel;
        this.valor = valor;
    }

    // Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(Date dataPartida) {
        this.dataPartida = dataPartida;
    }

    public Date getDataRetorno() {
        return dataRetorno;
    }

    public void setDataRetorno(Date dataRetorno) {
        this.dataRetorno = dataRetorno;
    }

    public String getNomeHotel() {
        return nomeHotel;
    }

    public void setNomeHotel(String nomeHotel) {
        this.nomeHotel = nomeHotel;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
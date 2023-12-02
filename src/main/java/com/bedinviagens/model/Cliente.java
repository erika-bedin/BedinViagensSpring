package com.bedinviagens.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "Cliente")
public class Cliente {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
    private String nome;
	
    private String rg;
	
    private String cpf;
	
	@DateTimeFormat(iso = ISO.DATE, pattern = "yyyy-MM-dd")
    private Date dataNascimento;
	
    private String endereco;
	
    private int numero;
	
    private String bairro;
	
    private String cidade;
	
    private String estado;
	
    private String email;
	
    private String celular;
	
    private boolean whatsapp;

        
    public Cliente(Long id, String nome, String rg, String cpf, Date dataNascimento, String endereco, int numero, 
    		String bairro, String cidade, String estado, String email, String celular, boolean whatsapp) {
    	this.id = id;
    	this.nome = nome;
    	this.rg = rg;
    	this.cpf = cpf;
    	this.dataNascimento = dataNascimento;
    	this.endereco = endereco;
    	this.numero = numero;
    	this.bairro = bairro;
    	this.cidade = cidade;
    	this.estado = estado;
    	this.email = email;
    	this.celular = celular;
    	this.whatsapp = whatsapp;
    }

    // Construtor vazio
    public Cliente() {
    }
    
    // Getters e Setters para todos os campos

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public boolean isWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(boolean whatsapp) {
        this.whatsapp = whatsapp;
    }

	public Cliente orElse(Object object) {
		// TODO Auto-generated method stub
		return null;
	}
}

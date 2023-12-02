package com.bedinviagens.entidades;

import com.bedinviagens.enums.MelhorPeriodoContato;
import com.bedinviagens.enums.PreferenciaContato;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "Mensagem")
public class Mensagem {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private String nomeRemetente;
    private String telefoneRemetente;
    private String emailRemetente;
    private String mensagemRemetente;
    private PreferenciaContato preferenciaContato;
    private MelhorPeriodoContato melhorPeriodoContato;
    private boolean receberDescontos;

    //Construtor vazio
    public Mensagem() {
    }

    // Getters e Setters para todos os campos

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
    public String getNomeRemetente() {
        return nomeRemetente;
    }

    public void setNomeRemetente(String nomeRemetente) {
        this.nomeRemetente = nomeRemetente;
    }

    public String getTelefoneRemetente() {
        return telefoneRemetente;
    }

    public void setTelefoneRemetente(String telefoneRemetente) {
        this.telefoneRemetente = telefoneRemetente;
    }

    public String getEmailRemetente() {
        return emailRemetente;
    }

    public void setEmailRemetente(String emailRemetente) {
        this.emailRemetente = emailRemetente;
    }

    public String getMensagemRemetente() {
        return mensagemRemetente;
    }

    public void setMensagemRemetente(String mensagemRemetente) {
        this.mensagemRemetente = mensagemRemetente;
    }

    public PreferenciaContato getPreferenciaContato() {
        return preferenciaContato;
    }

    public void setPreferenciaContato(PreferenciaContato preferenciaContato) {
        this.preferenciaContato = preferenciaContato;
    }

    public MelhorPeriodoContato getMelhorPeriodoContato() {
        return melhorPeriodoContato;
    }

    public void setMelhorPeriodoContato(MelhorPeriodoContato melhorPeriodoContato) {
        this.melhorPeriodoContato = melhorPeriodoContato;
    }

    public boolean isReceberDescontos() {
        return receberDescontos;
    }

    public void setReceberDescontos(boolean receberDescontos) {
        this.receberDescontos = receberDescontos;
    }
    
}

package com.bedinviagens.enums;

public enum PreferenciaContato {
	EMAIL("OPCAO1"),
    TELEFONE("OPCAO2"),
    WHATSAPP("OPCAO3");
	
    private final String valor;

    PreferenciaContato(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public static PreferenciaContato fromValor(String valor) {
        for (PreferenciaContato preferencia : values()) {
            if (preferencia.valor.equalsIgnoreCase(valor)) {
                return preferencia;
            }
        }
        throw new IllegalArgumentException("Valor inválido para PreferenciaContato: " + valor);
    }
}
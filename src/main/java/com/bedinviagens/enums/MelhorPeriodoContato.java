package com.bedinviagens.enums;

public enum MelhorPeriodoContato {
    MANHA("1"),
    TARDE("2"),
    NOITE("3");

    private final String valor;

    MelhorPeriodoContato(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public static MelhorPeriodoContato fromValor(String valor) {
        for (MelhorPeriodoContato periodo : values()) {
            if (periodo.valor.equals(valor)) {
                return periodo;
            }
        }
        throw new IllegalArgumentException("Valor inválido para MelhorPeriodoContato: " + valor);
    }
}
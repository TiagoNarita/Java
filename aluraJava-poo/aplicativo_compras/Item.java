package com.example.aplicativo_compras;

public class Item implements Comparable {

    private String nome;
    private int valor;
    public Item(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return this.nome + " - " + this.valor;
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

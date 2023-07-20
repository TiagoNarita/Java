package com.example.primeiroprojetodados;

public class Alunos {
    private String nome;

    public Alunos(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object obj) {
        Alunos outro = (Alunos) obj;
        return outro.getNome().equals(this.nome);
    }

    @Override
    public String toString() {
        return nome;
    }
}

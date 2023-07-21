package com.example.primeiroprojetodados;

public class VetorTeste {
    public static void main(String[] args) {
        Alunos a1 = new Alunos("Tiago");
        Alunos a2 = new Alunos("Pedro");
        Alunos a3 = new Alunos("Jorge");

        Vetor lista = new Vetor();

        System.out.println(lista.tamanho());
        lista.adiciona(a1);
        System.out.println(lista.tamanho());
        lista.adiciona(a2);
        System.out.println(lista.tamanho());
        System.out.println(lista);

        System.out.println(lista.contem(a1));
        System.out.println(lista.contem(a3));

        System.out.println(lista.pega(1));

        lista.adiciona(0,a3);
        System.out.println(lista);
        lista.remove(2);
        System.out.println(lista);

        for(int i = 0; i < 300; i++) {
            Alunos y = new Alunos("Joao" + i);
            lista.adiciona(y);
        }
        System.out.println(lista);


    }
}

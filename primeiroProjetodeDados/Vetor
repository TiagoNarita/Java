package com.example.primeiroprojetodados;

import java.util.Arrays;

public class Vetor {
    private Alunos[] aluno = new Alunos[100];
    private int totalDeAlunos a= 0;

    private void garanteEspaco() {
        if(totalDeAlunos == aluno.length) {
            Alunos[] novoArray = new Alunos[aluno.length * 2];
            for(int i = 0; i < aluno.length; i++) {
                novoArray[i] = aluno[i];
            }
            this.aluno= novoArray;
        }

    }

    public void adiciona(Alunos alunos){
        this.garanteEspaco();
        this.aluno[totalDeAlunos] = alunos;
        totalDeAlunos++;
    }

    public void adiciona(int posicao, Alunos alunos) {
        this.garanteEspaco();

        if (posicaoOcupada(posicao)) {
            for (int i = totalDeAlunos - 1; i >= posicao; i -= 1) {
                aluno[i + 1] = aluno[i];
            }
            aluno[posicao] = alunos;
            totalDeAlunos++;
        }else {
            throw new IllegalArgumentException("posiçao invalida");
        }
    }
    public Alunos pega(int posicao) {
        //recebe uma posição e devolve o aluno
        if (posicaoOcupada(posicao)){
            return aluno[posicao];
        }
        else {
            throw new IllegalArgumentException("posiçao invalida");
        }
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < totalDeAlunos;
    }


    public void remove(int posicao) {
        //remove pela posição
            for (int i = posicao; i < this.totalDeAlunos; i++) {
                this.aluno[i] = this.aluno[i + 1];
            }
    }

    public boolean contem(Alunos alunos) {
        for (int i = 0; i < totalDeAlunos; i++) {
            if (alunos.equals(this.aluno[i])){
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        return totalDeAlunos;
    }

    @Override
    public String toString() {
        //facilitará na impressão
        return Arrays.toString(aluno);
    }

}


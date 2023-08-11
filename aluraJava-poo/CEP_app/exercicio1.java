package com.example.exercicio1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Digite um numero de CEP para consulta");
        var cep = scanner.nextLine();

        try{
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);

            ImprimeCep imprimeCep = new ImprimeCep();
            imprimeCep.salvaJason(novoEndereco);

        }catch (RuntimeException | IOException e ){
            System.out.println(e.getMessage());
            System.out.println("finalizando a aplicação");
        }





    }
}

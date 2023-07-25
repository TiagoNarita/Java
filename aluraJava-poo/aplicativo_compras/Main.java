package com.example.aplicativo_compras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao;

        Scanner scanner = new Scanner(System.in);
        Cartao cartao = new Cartao();

        System.out.print("Digite o limite do cartão: ");
        int numero = scanner.nextInt();
        cartao.setLimiteDoCartao(numero);
        scanner.nextLine(); // Consumir a quebra de linha pendente após nextInt()

        List<Item> listaDeItem = new ArrayList<>();

        do {
            System.out.print("Digite a descrição da compra : ");
            String nome = scanner.nextLine();

            System.out.print("Digite o valor da compra: ");
            int valor = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha pendente após nextInt()
            if(cartao.descontaValor(valor) == 0){
                System.out.println("""
                        Saldo insuficiente!
                        *********************
                        Compras realizadas:
                        """);
                for (Item item : listaDeItem) {
                    System.out.println(item);
                }
                System.out.println("\n*********************\n");
                System.out.println("Saldo do cartão: " + cartao.getLimiteDoCartao());
                break;
            }


            Item item = new Item(nome, valor);
            listaDeItem.add(item);

            System.out.println("Item adicionado à lista: " + item);

            System.out.println("Digite 0 para sair ou 1 para continuar com as compras");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha pendente após nextInt()

            if (opcao != 1 && opcao != 0) {
                System.out.println("Opção inválida. Saindo...");
                break; // Finalizar o loop se a opção for diferente de 0 ou 1
            } else if (opcao == 0) {
                System.out.println("Lista de compras:");
                for (Item itemLista : listaDeItem) {
                    System.out.println(itemLista);
                }
            }
        } while (opcao != 0);
        scanner.close();
    }
}

import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        int numeroSorteado = new Random().nextInt(100);
        int chute;
        Scanner scan = new Scanner(System.in);

        System.out.println("JOGO DE ADIVINHAÇÃO");
        System.out.println("Você terá 5 tentativas para acertar o número, VAMOS COMEÇAR!! ");
        for (int i = 0; i < 5; i++) {
            System.out.println(String.format("Digite o número que voce acha que é: (tentativa %d de 5)", i + 1));
            chute = scan.nextInt();
            if (chute > numeroSorteado){
                System.out.println("O numero que você digitou é maior que o escolhido!");
            }
            else if(chute < numeroSorteado){
                System.out.println("O numero que voce digitou é menor que o escolhido!");
            }
            else {
                System.out.println(String.format("Você acertouuu!!! o numero escolhido éra %d", numeroSorteado));
                break;
            }

            if (i == 4){
                System.out.println(String.format("Suas tentativas acabaram, sinto Muito você chegou perto mas não conseguiu, o número sorteado éra %d",numeroSorteado ));
            }
        }
    }
}

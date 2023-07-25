public class condicional {
    public static void main(String[] args) {
            int anoDelancamento = 2022;
            boolean incluidoNoPlano = true;
            String tipoPlano = "Plus";

            if (anoDelancamento >= 2022){
                System.out.println("Lançamento que os clientes estão curtindo");
            } else {
                System.out.println("Filmes retrôs que vale a pena assitir!");
            }

            if (incluidoNoPlano == true && tipoPlano.equals("Plus")){
                System.out.println("Filme liberado");
            }else {
                System.out.println("Assite o plano para assistir");
            }

    }
}

public class teste {
    public static void main(String[] args) {


        System.out.println("Aplicativo que converte temperatura Celsius em Fahrenheit.");

        double temperatura1 = 36.5;

        double formula = temperatura1 * 1.8 + 32;

        int formulaint = (int) (temperatura1 * 1.8) + 32;

        System.out.println(formula);

        System.out.println(formulaint);

        System.out.println(String.format("A temperatura em Celsius %.2fC° em fahrenheit virá: %.2fF", temperatura1, formula));
    }
}

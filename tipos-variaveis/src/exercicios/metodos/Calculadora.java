package exercicios.metodos;
public class Calculadora {
    public static void soma(double primeiroNumero, double segundoNumwero) {
        
        double resultado = primeiroNumero + segundoNumwero;
        System.out.println("A soma de" + primeiroNumero + " + " + segundoNumwero + " = " + resultado);
    }

   public static void subtracao(double primeiroNumero, double segundoNumwero) {
        
        double resultado = primeiroNumero - segundoNumwero;
        System.out.println("A subtracao de" + primeiroNumero + " - " + segundoNumwero + " = " + resultado);
    }

    public static void multiplicacao(double primeiroNumero, double segundoNumwero) {
        
        double resultado = primeiroNumero * segundoNumwero;
        System.out.println("A multiplicacao de" + primeiroNumero + " * " + segundoNumwero + " = " + resultado);
    }
    public static void divisao(double primeiroNumero, double segundoNumwero) {
        
        double resultado = primeiroNumero / segundoNumwero;
        System.out.println("A divisao de" + primeiroNumero + " / " + segundoNumwero + " = " + resultado);
    }
}

    
package exercicios.repeticao;

import java.util.Scanner;

public interface Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número que você queira que seja fatorial: ");
        int numero = scanner.nextInt();
        int multiplicacao = 1;

        System.out.println(numero + "! = ");
        for(int i = numero; i > 1; i-- ){
            multiplicacao = multiplicacao * i;

        }

        System.out.println(multiplicacao);
    }
}

package exercicios.repeticao;
import java.util.Scanner;
public class Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua nota");
        double nota = scanner.nextDouble();
    while (nota >0 && nota <= 10) {
        System.out.println("Você inseriu corretamente");
        break;
    }
    while (nota < 0 || nota > 10) {
        System.out.println("Insira uma nota entre 0 e 10");
        nota = scanner.nextDouble();
    }    
    scanner.close();
    }
}

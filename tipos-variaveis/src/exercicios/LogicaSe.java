package exercicios;
import java.util.Scanner;
public class LogicaSe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o nome do aluno: ");
        String nomeALuno = scanner.nextLine();
             System.out.print("Qual sua primeira nota? ");
        double nota1 = scanner.nextDouble();
             System.out.print("Qual sua segunda nota? ");
        double nota2 = scanner.nextDouble();
             System.out.print("Qual sua terceira nota? ");
        double nota3 = scanner.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
        scanner.close();
        System.out.println("A media do aluno " + nomeALuno + " foi " + media);
        if (media >= 7 && media <= 10) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        
    }
}

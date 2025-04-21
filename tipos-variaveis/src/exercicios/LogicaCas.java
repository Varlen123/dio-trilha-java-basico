package exercicios;
public class LogicaCas {
    public static void main(String[] args) {
        short posicaoDoAtleta = 1;
        switch (posicaoDoAtleta) {
            case 1:
                System.out.println("O atleta de primeira posição ganhou um concurso de natação");
                break;
            case 2:
                System.out.println("O atleta de segunda posição ganhou um concurso de natação");
                break;
            case 3:
                System.out.println("O atleta de terceira posição ganhou um concurso de natação");
                break;
            default:
                System.out.println("O atleta nem participou do concurso de natação");
            }
}}

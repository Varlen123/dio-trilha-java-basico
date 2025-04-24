package exercicios.repeticao;

public class OrdemInversa {
    public static void main(String[] args) {
        
        int [] vetor = {5, -3, 5, 6, 7, 8};
        int count = 0;
        while (count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }
        for(int i = (vetor.length -1); i >= 0; i--){
            System.out.println(vetor[i] + " ");
        }
    }
    
}
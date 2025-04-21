public class Usuario{
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println("O carro está ligado? " + carro.ligado);
        System.out.println("O carro é " + carro.nomeDoCarro);
        System.out.println("A cor do carro é " + carro.corDoCarro);
        System.out.println("O carro foi fabricado em " + carro.anoDoCarro);
        System.out.println("A velocidade do carro é " + carro.velocidadeDoCarro);
        System.out.println("O preco do carro é " + carro.precoDoCarro);    
    }
    
}

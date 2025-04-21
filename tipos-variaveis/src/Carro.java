public class Carro {
    boolean ligado = false;
    String nomeDoCarro = "Ferrari";
    String corDoCarro = "Vermelho";
    String anoDoCarro = "2010";
    String velocidadeDoCarro = 300 + "km/h";
    double precoDoCarro = 1000000.00;

public void aumentoVelocidade(){
        velocidadeDoCarro = velocidadeDoCarro + 10;

}
public void ligar (){
        ligado = true;
    }

public void desligar(){
        ligado = false;
    }
}

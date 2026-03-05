
package exercicio4;

public class Carro extends Veiculo {

    public Carro(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    public void exibirVelocidade() {
        System.out.println("Velocidade máxima: " + velocidadeMaxima + " km/h");
    }
}

package exercicio3;


public class Exercicio3 {

    
    public static void main(String[] args) {
        contaBancaria conta = new contaBancaria();
        
        conta.titular = "max!";
        conta.getSaldo();
        conta.depositar(110);
        conta.getSaldo();
        conta.sacar(180);
        conta.getSaldo();
        
    }
    
}


package exercicio3;


public class contaBancaria {
    public String titular;
    private double saldo;
    
    public String getTitular(){
        return titular;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        if(saldo > 0){
        }else{
            System.out.println("saldo invalido");
            
        }
    }
    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
        }else{
            System.out.println("valor invalido");
            
        }
        
    }
    public void sacar(double valor){
        if(valor<=saldo){
            saldo -= valor;
        }else{
            System.out.println("saldo insuficiente");
        }
    }
}

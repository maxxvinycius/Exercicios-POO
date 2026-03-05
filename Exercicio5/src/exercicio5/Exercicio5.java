
package exercicio5;


public class Exercicio5 {

    
    public static void main(String[] args) {
       Funcionario f1 = new Funcionario();
       f1.setNome("Max");
       f1.setSalario(4000);
       
        System.out.println("Nome: " + f1.getNome());
        System.out.println("Salário: " + f1.getSalario());
        
        Funcionario f2 = new Funcionario();
        f2.setNome("Miguel");
        f2.setSalario(4500);
        
        System.out.println("Nome: " + f2.getNome());
        System.out.println("Salário: " + f2.getSalario());
        
        Funcionario f3 = new Funcionario();
        f3.setNome("João");
        f3.setSalario(5000);
        
        System.out.println("Nome: " + f3.getNome());
        System.out.println("Salário: " + f3.getSalario());
    }
    
}

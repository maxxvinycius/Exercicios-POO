
package exercicio1;


public class Exercicio1 {

    
    public static void main(String[] args) {
        Produto pro1 = new Produto();
        pro1.setNome("notebook");
        pro1.setPreco(3500);
        
        System.out.println("nome do 1° produto: " + pro1.getNome());
        System.out.println("preço: " + pro1.getPreco());
        
        Produto pro2 = new Produto();
        pro2.setNome("teclado");
        pro2.setPreco(300);
        
        System.out.println("nome do 2° produto: " + pro2.getNome());
        System.out.println("preço: " + pro2.getPreco());
        
        Produto pro3 = new Produto();
        pro3.setNome("mouse");
        pro3.setPreco(180);
        
        System.out.println("nome do 3° produto: " + pro3.getNome());
        System.out.println("preço: " + pro3.getPreco());
    }
    
}


package exercicio6;


public class Exercicio6 {

    
    public static void main(String[] args) {
        
        Usuario u = new Usuario("admin", "1234");
        
        if(u.autenticar("admin", "1234")){
            System.out.println("Senha Realizada com Sucesso");
        }else{
            System.out.println("Senha ou Login Incorretos");
        }
    }
    
}


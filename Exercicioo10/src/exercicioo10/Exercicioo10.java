package exercicioo10;


public class Exercicioo10 {
    
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.setMarca("bmw");
        c1.setModelo("3 series");
        c1.setAno(2019);
        
        System.out.println("marca: " + c1.getMarca());
        System.out.println("modelo: " + c1.getModelo());
        System.out.println("----------");
        
        
        Carro c2 = new Carro();
        c2.setMarca("palio");
        c2.setModelo("fiat");
        c2.setAno(1885);
        
        System.out.println("marca: " + c2.getMarca());
        System.out.println("modelo: " + c2.getModelo());
        System.out.println("----------");
        
        
        Carro c3 = new Carro();
        c3.setMarca("toyota");
        c3.setModelo("corolla");
        c3.setAno(2018);
        
        System.out.println("marca: " + c3.getMarca());
        System.out.println("modelo: " + c3.getModelo());
    }


    
    }
    
              
  
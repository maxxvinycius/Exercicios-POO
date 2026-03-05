
package exercicioo10;


public class Carro {
    private String marca;
    private String modelo;
    public int ano;
    
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setAno(int ano){
        if(ano>=1886){
            System.out.println("Ano válido!");
        }else{
            System.out.println("ano inválido");
        }
}
}

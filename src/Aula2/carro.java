
package Aula2;

public class carro {
    
    String modelo;
    double preco;
    int velocidade;
    
    void acelerar(int acelerar){
        
    this.velocidade += acelerar; 
        System.out.println("O carro esta aumentando a velocidade");
    }
    
    void mostravelocidade(){
        System.out.println("Velocidade "+this.velocidade+"KM/H");
    }
    
    void freiar(){
        if (this.velocidade > 0) {
         this.velocidade -= 5;
            System.out.println("Carro diminuindo velocidade");
        }
                  
        
    }
    void modelo(String modelo){
  this.modelo = modelo;
        System.out.println("Modelo: "+this.modelo);
    }
    void alterarpreco (double preco){
        this.preco = preco;
        System.out.println("Preco: "+this.preco);
    }
}


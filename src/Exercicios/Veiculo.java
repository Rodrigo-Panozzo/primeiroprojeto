
package Exercicios;


public class Veiculo {
    String cor;
    String marca;
    String tipo;
    double preco;
    
    
    void marca(String mar){
        this.marca = mar;
        System.out.println("A marca é: "+this.marca);
    }
    
    void cor(String c){
        this.cor = c;
        System.out.println("A cor é: "+this.cor);
    }
    
     void preco(double pre){
        this.preco = pre;
        System.out.println("O peso é: "+this.preco+"KG");
    }
     
     void tipo(String tip){
         this.tipo = tip;
         System.out.println("O tipo é: "+this.tipo);
     }
}

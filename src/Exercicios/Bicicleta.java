
package Exercicios;


public class Bicicleta {
    
    String tamanho;
    String marca;
    double preco;
    String cor;

    void tamanho(String tam){
        this.tamanho = tam;
        System.out.println("O tamanho é: "+this.tamanho);
    }
    
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
    
}


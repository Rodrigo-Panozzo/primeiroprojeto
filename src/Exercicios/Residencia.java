
package Exercicios;


public class Residencia {
    
    String tamanho;
    String cor;
    String tipo;
    double preco;
    
    void tamanho(String tam){
        this.tamanho = tam;
        System.out.println("O tamanho é: "+this.tamanho);
    }
    
    void tipo(String tip){
        this.tipo = tip;
        System.out.println("A marca é: "+this.tipo);
    }
    
    void cor(String c){
        this.cor = c;
        System.out.println("A cor é: "+this.cor);
    }
    
    
    void preco(double pre){
        this.preco = pre;
        System.out.println("O peso é: "+this.preco+"R$");
    }
    
}

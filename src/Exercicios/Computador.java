
package Exercicios;


public class Computador {
    String tamanho;
    String cor;
    double peso;
    double preco;
    
    void tamanho(String tam){
        this.tamanho = tam;
        System.out.println("O tamanho é: "+this.tamanho);
    }
    
    void cor(String c){
        this.cor = c;
        System.out.println("A cor é: "+this.cor);
    }    
    
    void peso(double pes){
        this.peso = pes;
        System.out.println("O peso é: "+this.peso);
    }
    
    void preco(double pre){
        this.preco = pre;
        System.out.println("O peso é: "+this.preco+"R$");
    }
    
}

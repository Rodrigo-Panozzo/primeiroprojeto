
package Exercicios;

public class Eletrodomestico {
    String tamanho;
    String marca;
    double peso;
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
    
    
    void peso(double pes){
        this.peso = pes;
        System.out.println("O peso é: "+this.peso+"KG");
    }
}


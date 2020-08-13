
package Exercicios;


public class Pessoa {
    
    String nome;
    String sexo;
    float altura;
    float peso;
    int idade;
    
    void nome(String nom){
        this.nome = nom;
        System.out.println("O nome é: "+this.nome);
    }
    
    void sexo(String sex){
        this.sexo = sex;
        System.out.println("O sexo é: "+this.sexo);
    }
    
    void altura(float alt){
        this.altura = alt;
        System.out.println("A altura é: "+this.altura);
    }
    
     void peso(float pes){
        this.peso = pes;
        System.out.println("A altura é: "+this.peso+"KG");
    }
     
     void idade(int ida){
         this.idade = ida;
         System.out.println("A idade é: "+this.idade);
     }
    
    
}


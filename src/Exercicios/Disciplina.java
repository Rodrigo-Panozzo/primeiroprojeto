
package Exercicios;


public class Disciplina {
    String nome;
    int quantidadeDeAlunos;
    int quantimeninas;
    int quantimeninos;
    
    void quantidadeDeAlunos(int quanti){
    this.quantidadeDeAlunos = quanti;
    System.out.println("A quantidade de alunos é: "+this.quantidadeDeAlunos);
    }
    
    void quantimeninas(int quanti){
    this.quantimeninas = quanti;
    System.out.println("A quantidade de meninas é: "+this.quantimeninas);
    }
    
    void quantimeninos(int quanti){
        this.quantimeninos = quanti;
        System.out.println("A quantidade de meninos é: "+this.quantimeninos);
    }
    
    void nome(String nom){
        this.nome = nom;
        System.out.println("O nome da disciplina é: "+this.nome);
    }
    
    
}

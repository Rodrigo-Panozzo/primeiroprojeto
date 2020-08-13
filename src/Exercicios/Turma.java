
package Exercicios;

public class Turma {
    int quantidadeDeAlunos;
    int quantimeninas;
    int quantimeninos;
    String anodasala;
    
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
    
    void anodasala(String ano){
        this.anodasala = ano;
        System.out.println("O ano da sala é: "+this.anodasala);
    }
}

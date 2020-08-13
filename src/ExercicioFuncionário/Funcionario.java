
package ExercicioFuncionário;

public class Funcionario {
    
    String primeironome;
    String sobrenome;
    double salariomensal;
    
    void primeironome(String nome){
        this.primeironome = nome;
        System.out.println("Primeiro nome: "+this.primeironome);
    }
    
    void sobrenome(String sobre){
        this.sobrenome = sobre;
        System.out.println("Sobrenome: "+this.sobrenome);
    }
    
    void salariomensal(double salario){
    if(salario <= this.salariomensal){
    System.out.println("O salario Mensal não é positivo");

    }else{
        this.salariomensal = salario;
        System.out.println("Primeiro nome: "+this.primeironome+ " "+this.sobrenome+ ": "+this.salariomensal);

}   
}
    void mostrarsalario(){
        System.out.println("O salario é: "+this.salariomensal);
    }
    
    void Salarioanual(){
    this.salariomensal *=12;
        System.out.println("O salario anual é: "+this.salariomensal);
    }
    
    void aumento(){
    this.salariomensal *=1.10;
        System.out.println("O salario aumentou: "+salariomensal);
    }
    
    
}


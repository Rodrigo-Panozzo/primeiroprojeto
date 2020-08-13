
package ExercicioFuncionário;

public class MainFuncionario {
    public static void main(String[] args) {
        
        Funcionario Funcionario1= new Funcionario();
        Funcionario Funcionario2= new Funcionario();
        
        Funcionario1.primeironome = "Rodrigo";
        Funcionario1.sobrenome = "Panozzo";
        Funcionario1.salariomensal(500);
        Funcionario1.Salarioanual();
        Funcionario1.aumento();
        
        Funcionario2.primeironome = "Mateus";
        Funcionario2.sobrenome = "Panozzo";
        Funcionario2.salariomensal(300);
        Funcionario2.Salarioanual();
       Funcionario2.aumento();
        
        
    }
    
   
}

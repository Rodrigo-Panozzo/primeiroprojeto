
package aula3;


public class mainprofessor {
    public static void main(String[] args) {
        
        Professor Professor1=new Professor();
        Professor Professor2=new Professor();
        
        Professor1.nome = "Alberto";
        Professor1.sobrenome = "dale";
        Professor1.Disicplinas_ministradas = "Matematica";
        Professor1.tipo_professor = "Mensalista";
        Professor1.Salario_mensal = 4000;
        
        Professor1.nome = "Vinicius";
        Professor1.sobrenome = "Brunoni";
        Professor1.Disicplinas_ministradas = "Biologia";
        Professor1.tipo_professor = "Horista";
        Professor1.Salario_mensal = 6000;

        
        Professor1.alterarnome ("Rodrigo");
        Professor1.alterasobrenome("Panozzo");
        Professor1.alteradisciplina("Geografia");
        Professor1.alteratipoprof("Horista");
        Professor1.salariomensal(3000);
        
        Professor2.alterarnome("Mateus");
        Professor2.alterasobrenome("Panozzo");
        Professor2.alteradisciplina("Física");
        Professor2.alteratipoprof("Mensalista");
        Professor2.salariomensal(3000);
        
    }
    
}

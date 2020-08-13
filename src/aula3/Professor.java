
package aula3;


public class Professor {
    String nome;
    String sobrenome;
    String Disicplinas_ministradas;
    double Salario_mensal, horas;
    String tipo_professor;
    
    void alterarnome(String alteranom){
        this.nome=alteranom;
    }
    
    void alterasobrenome(String alterasobre){
        this.nome=alterasobre;
    }
    
    void alteradisciplina(String alteradisc){
        this.Disicplinas_ministradas=alteradisc;
        
    }
    
    void alteratipoprof(String prof){
        this.tipo_professor=prof;
        
    }
    
    void salariomensal(double salario){
        this.Salario_mensal=salario;
        
    }
    
    void horas(double hora){
        this.horas = hora;
    }
    
    
}

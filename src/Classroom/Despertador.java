
package Classroom;


public class Despertador {
    
    double horas;
    double minutos;
    double segundos;
    
    Despertador (double h, double m, double s){
        this.horas=h;
        this.minutos=m;
        this.segundos=s;
    }
    
    void ativar(){
        System.out.println("Despertador configurado");
    }
    
    void imprimir(){
        System.out.println("Horas: "+this.horas+"Minutos: "+this.minutos+"Segundos: "+this.segundos);
    }
    


  
    
}

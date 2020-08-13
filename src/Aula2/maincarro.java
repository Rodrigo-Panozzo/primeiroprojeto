
package Aula2;


public class maincarro {
    public static void main(String[] args) {
        carro carro1=new carro();
       
        carro1.modelo = "Ferrari";
        carro1.preco = 500.000;
        
        carro1.acelerar(10);
        carro1.mostravelocidade();
        carro1.acelerar(50);
        carro1.mostravelocidade();
        carro1.freiar();
        carro1.mostravelocidade();
        

        carro1.modelo("Mustang");
        carro1.alterarpreco(750000);
        

    }
}

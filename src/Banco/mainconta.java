/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

public class mainconta {
    public static void main(String[] args) {
        Conta Conta1=new Conta();
        Conta Conta2=new Conta();
        
        Conta1.nome = "Panozzo";
        Conta1.cpf = "880.770.654-89";
        Conta1.idade = 18;
        Conta1.tipo = "Conta Corrente";
        
        Conta2.nome = "Mateus";
        Conta2.cpf = "989.765.432-12";
        Conta2.idade = 21;
        Conta2.tipo = "Conta Poupança";
        
        Conta1.deposita(500);
        Conta1.mostrasaldo();
        Conta1.saca(100);
        Conta1.mostrasaldo();
        Conta1.saca(500);
        Conta1.mostrasaldo();

  
    }
}

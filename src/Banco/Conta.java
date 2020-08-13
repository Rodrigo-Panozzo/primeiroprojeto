
package Banco;


public class Conta {
    
    int numero;
    int agencia;
    String tipo;
    String nome;
    int idade;
    String cpf;
    double saldo;
    
    void deposita(double deposita){
        this.saldo += deposita;
    }
    
    void saca(double valorsacar){
        if(valorsacar <= this.saldo -1){
        if (this.tipo == "Conta Corrente" || this.tipo == "Conta corrente"){
        this.saldo -= valorsacar;
        this.saldo -= 1;
        }
        }else{
            System.out.println("Saldo Inferior ao saque");
        } 
           
        if (valorsacar <= this.saldo){
                if (this.tipo == "Conta Poupança" || this.tipo == "Conta Poupança"){
                    this.saldo -= valorsacar;
                }
            }else{
            System.out.println("Saldo inferior ao valor do saque");
        }
        }
    

    void transfere(Conta destino, double valor){
        if(valor <= this.saldo){
        this.saldo -= valor;
        destino.saldo += valor; 
        }else{
            System.out.println("Saldo inferior ao valor transferido");
        }
       
    }

    void mostrasaldo(){
        System.out.println("Saldo da conta de "+this.nome+ " :"+this.saldo);
    }
}

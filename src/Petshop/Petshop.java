
package Petshop;

public class Petshop {
    String tipo_animal;
    String nome_animal;
    String especie;
    String dono_animal;
    String cpf_dono;
    String endereco;
   
    
    void tipo_animal(String tipo){
        this.tipo_animal=tipo;
        System.out.println("O tipo de animal é: "+this.tipo_animal);
        if (this.tipo_animal == "Cachorro" || this.tipo_animal == "Gato"){
            
        }
            
    
            }
     void nome_animal(String nome){
        this.nome_animal=nome;
        System.out.println("O nome do animal é: "+this.nome_animal);
    }
     void especie(String espec){
        this.especie=espec;
        System.out.println("a especie é: "+this.especie);
    }
     void dono_animal(String dono){
        this.dono_animal=dono;
        System.out.println("O dono do animal é: "+this.dono_animal);
    }
      void cpf_dono(String cpf){
        this.cpf_dono=cpf;
        System.out.println("O cpf é: "+this.cpf_dono);
    }
       void endereco(String ende){
        this.endereco=ende;
        System.out.println("O endereco é: "+this.endereco);
    }
}

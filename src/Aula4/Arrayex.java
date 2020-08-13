
package Aula4;

import java.util.Scanner;


public class Arrayex {
    int vetor[];
    
    Arrayex(int vetor []){
        this.vetor=vetor;
    }
    
    Arrayex(){
        
    }
    
    Scanner leitor= new Scanner(System.in);
    void preenche_array(int tamanho){
       
        int i;
        this.vetor = new int[tamanho];
        
  
        for(i=0;i<vetor.length;i++){
            System.out.println("Digite os valores: "+i+":");
        vetor[i]= leitor.nextInt();
        }
    }
        void imprime_array(){
        int i;
            System.out.println("IMPRIMINDO ARRAY");
        for(i=0;i<this.vetor.length;i++){
            System.out.println("Posição"+i+"; "+this.vetor[i]);
    }
    }
    
}

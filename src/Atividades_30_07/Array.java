
package Atividades_30_07;

import java.util.Scanner;


public class Array {
    
    int[] vetor = new int[4];
    
    void preenche_array(){
        int i;
        
        Scanner leitor= new Scanner(System.in);
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

    
    



package Exercicio1;

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
    void somararray(){
        int soma = 0;
        
        for(int i=0;i<vetor.length;i++){
            soma+=vetor[i];
            System.out.println("Soma: "+soma);
        }
    }
    
  
}



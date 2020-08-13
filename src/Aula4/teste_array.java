
package Aula4;

import java.util.Scanner;

public class teste_array {
    public static void main(String[] args) {
        
        int vetor[]= new int[5]; 
        int i;
        
        Scanner leitor= new Scanner(System.in);
        for(i=0; i<vetor.length;i++){
            System.out.println("Digite o Valor da posição"+i+":");
            vetor[i]= leitor.nextInt();
        }
       
        System.out.println("Imprimindo o Array");
        
        for(i=0;i<vetor.length;i++){
            System.out.println("Posição "+i+": "+vetor[i]);
        }
            }
    
}

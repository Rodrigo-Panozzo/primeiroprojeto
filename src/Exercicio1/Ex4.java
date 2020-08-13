/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

import java.util.Scanner;

public class Ex4 {
    
     int[] vetor = new int[1000];
    
    void preenche_array(){
        int i;
        
        Scanner leitor= new Scanner(System.in);
        for(i=99;i<vetor.length;i++){
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
    

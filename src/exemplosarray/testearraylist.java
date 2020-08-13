/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplosarray;

import java.util.ArrayList;

/**
 *
 * @author rodri
 */
public class testearraylist {
    public static void main(String[] args) {
         int n=10;
         ArrayList <Integer> numeros = new ArrayList();
         
         for(int i=0; i<n; i++){
             numeros.add(i);
             System.out.println(numeros.get(i));
         }
         
         System.out.println("Tamanho do array list");
         System.out.println(numeros.size());
        
         numeros.remove(9);
         numeros.remove(8);
         
         System.out.println("Tamanho do array list após diminuir");
         System.out.println(numeros.size());
         
         System.out.println("Array apos diminuir");
         for (int i=0; i<8;i++){
             System.out.println(numeros.get(i));
         }
         
         numeros.clear();
         System.out.println("Array depois de deletar");
         System.out.println(numeros.size());
    }
    
    
    
}

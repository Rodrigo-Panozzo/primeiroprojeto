/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplosarray;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rodri
 */
public class mainarray {
    public static void main(String[] args) {
        List <formas> Lista = new ArrayList();
        Lista.add(new quadrado("quadrado1"));
        Lista.add(new triangulo("triangulo1"));
        
        for (formas f : Lista){
            System.out.println(f.getNome());
        }
      
        
 
    }
    
}

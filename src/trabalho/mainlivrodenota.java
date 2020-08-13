/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

/**
 *
 * @author rodri
 */
public class mainlivrodenota {
    public static void main(String[] args) {
        LivroNota n1 = new LivroNota();
        
        n1.setCurso("TI");
        n1.setProfessor("Ricardo");
        
        System.out.println(n1.getCurso());
        System.out.println(n1.getProfessor());
    }
    }

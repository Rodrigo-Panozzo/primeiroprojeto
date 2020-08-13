/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos_de_interface;

/**
 *
 * @author rodri
 */
public abstract class Operacao implements Op{
    protected double d1;
    protected double d2;
   
    @Override
    public void ajustaValores(double dA, double dB){
        d1= dA;
        d2= dB;
    }
    
    @Override
    abstract public String calcular();
}

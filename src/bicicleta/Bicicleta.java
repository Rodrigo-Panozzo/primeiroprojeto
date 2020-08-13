
package bicicleta;

public class Bicicleta {
    protected int catraca;
    protected int marcha;
    protected int velocidade;
    
    public Bicicleta(int catraca_inicial, int vel_inicial, int marcha_inicial){
        catraca = catraca_inicial;
        marcha = marcha_inicial;
        velocidade = vel_inicial;
       
    }
    
    public void setCatraca(int valor){
        catraca = valor;
    }
   
    public void serMarcha(int valor){
        marcha = valor;
    }
    
    public void ativarFreio(int decremento){
        velocidade -= decremento;
    }
  
    public void acelerar(int incremento){
        velocidade += incremento;
    }
}

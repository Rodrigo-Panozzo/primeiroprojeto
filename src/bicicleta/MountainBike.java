
package bicicleta;


public class MountainBike extends Bicicleta {
    
    public int alturaBanco;

    public MountainBike(int catraca_inicial, int vel_inicial, int marcha_inicial) {
        super(catraca_inicial, vel_inicial, marcha_inicial);
    }
  
    public void setAltura(int valor){
        alturaBanco = valor;
    }
    
    @Override
    public void acelerar(int inc){
        super.acelerar(inc);
        System.out.println(velocidade);
    }
    
}

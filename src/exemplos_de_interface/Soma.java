
package exemplos_de_interface;


public class Soma extends Operacao {
    public Soma(){
        d1= 0;
        d2= 0;
    }
    public Soma(double dA, double dB){
        d1= dA;
        d2= dB;
    }
    @Override
    public String calcular(){
        double r= 0;
        r=d1+d2;
        String msg = "A soma é: "+r;
        return msg;
    }
}

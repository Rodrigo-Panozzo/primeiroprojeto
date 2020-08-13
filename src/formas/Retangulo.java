
package formas;


public class Retangulo extends Quadrilatero {

    protected double b,h;
    
    
    public Retangulo(){
        b=5;
        h=5;
        area=b*h;
        System.out.println("area: "+area);
    }
    
}


package formas;


public class Trapezio extends Quadrilatero {
    protected double B,b,h;
    
    public Trapezio(){
        B=5;
        b=6;
        h=9;
        area=((B+b)/2)*h;
        System.out.println("area: "+area);
    }
    
}

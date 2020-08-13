
package Atividade22_07;

    
public class tri extends figura {

public tri() {

dim1 = 0;

dim2 = 0;

}

public tri(double dA, double dB) {

dim1 = dA;

dim2 = dB;

}

    
@Override
public String calcular() {

double r;

r = 2/(dim1 * dim2);

String msg = "Triangulo: " + r;

return msg;

}
}
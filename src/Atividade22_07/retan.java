package Atividade22_07;

 public class retan extends figura {

public retan() {

dim1 = 0;

dim2 = 0;

}

public retan(double dA, double dB) {

dim1 = dA;

dim2 = dB;

}

    @Override
public String calcular() {
double r;

r = 2*(dim1 + dim2);
dim2 = Math.sqrt(dim1);
String msg = "Retangulo: " + r;

return msg;

}
}

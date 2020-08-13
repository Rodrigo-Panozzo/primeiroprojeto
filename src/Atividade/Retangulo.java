
package Atividade;


public class Retangulo {
private static float largura;
private static float altura;

public float getLargura() {
	return largura;
}

public void setLargura(float largura) {

	if ((largura < 0.0) || (largura > 20.0)) {
		System.out.println("numero inválido");

	}else{
		this.largura = largura;
	}
}

public float getAltura() {
	return altura;
}

public boolean setAltura(float altura) {

	if ((altura < 0.0) || (altura > 20.0)) {
		System.out.println("numero invalido");
		return false;
		

	} else {
		Retangulo.altura = altura;
		return true;
	}
}

public float perimetro() {
	float p = 2 * (largura + altura);
	return p;
}

public float area() {
	float a = (largura * altura);
	return a;
}
}


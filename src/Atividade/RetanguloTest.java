
package Atividade;

import java.util.Scanner;

public class RetanguloTest {
	public static void main(String args[]) {
		Retangulo rentan = new Retangulo();
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("altura:");
		rentan.setAltura(entrada.nextFloat());
		
		System.out.print("largura:");
		rentan.setLargura(entrada.nextFloat());
		
		System.out.print("perimetro : " + rentan.perimetro() + " area :"
		+ rentan.area());
	}
}
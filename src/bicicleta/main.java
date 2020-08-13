
package bicicleta;


public class main {
    public static void main(String[] args) {
        
        MountainBike mountain = new MountainBike(2, 30, 1);
        
        mountain.setCatraca(3);
        mountain.serMarcha(3);
        mountain.setAltura(3);
        mountain.acelerar(40);
       mountain.ativarFreio(20);
       
        System.out.println("Você esta pedalando na velocidade :"+mountain.velocidade+"KM/H");
    }
    
}

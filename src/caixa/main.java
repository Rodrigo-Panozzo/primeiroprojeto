
package caixa;


public class main {
    public static void main(String[] args) {
        Caixa c1 = new Caixa(2,2,2);
       
       c1.getVolume();
        
       CaixaDeFosforo cdf= new CaixaDeFosforo(1,2,3,5);
       
             System.out.println("volume: "+c1.volume);
             
             System.out.println("Altura: "+cdf.altura+"/nLargura: "+cdf.largura+"/nProfundidade: "+cdf.profundidade+"/nVolume: "+cdf.volume);
       
       
       
        
    }
    
}

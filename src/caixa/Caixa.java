
package caixa;


public class Caixa {
    public static void main(String[] args) {
        
    }
    public double altura;
    public double largura;
    public double profundidade;
    public double volume;
    
   Caixa(){
        
    }
    
    
   public Caixa(double altura, double largura, double profundidade){
       this.altura=2;
       this.largura=2;
       this.profundidade=2;
   }
    
   public float getVolume(){
       volume= largura* altura* profundidade;
       return (float) volume;
   }
}

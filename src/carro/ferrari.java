
package carro;

public class ferrari extends Carro {
    protected int velocidade;
    
    
   @Override
    public void acelerar(int acl){
     super.acelerar(acl);
     this.velocidade +=acl;
        System.out.println("Acelerando a ferrari, velocidade: "+this.velocidade);
    }
}

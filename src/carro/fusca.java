
package carro;


public class fusca extends Carro {
    
    protected String posicao_motor;
    protected int velocidade;
    
    @Override
    public void acelerar(int acl){
     super.acelerar(acl);
     this.velocidade +=acl;
        System.out.println("Acelerando o Fusca, velocidade: "+this.velocidade);
    }
    
    public void freiar(int freiar){
        this.velocidade -=freiar;
         System.out.println("Acelerando o Fusca, velocidade: "+this.velocidade);
    }
}

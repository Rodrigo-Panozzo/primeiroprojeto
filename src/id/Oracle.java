
package id;


public class Oracle implements IDb {
    
    @Override
    public void conectar(){
        System.out.println("Conectando ao oracle");
    }
    @Override
    public void desconectar(){
        System.out.println("Desconectado do oracle");
    }
    
}

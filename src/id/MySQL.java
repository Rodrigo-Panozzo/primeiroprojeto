
package id;


public class MySQL implements IDb, Iteste {
    
    @Override
    public void conectar(){
        System.out.println("Conectando ao MySQL");
    }
    @Override
    public void desconectar(){
        System.out.println("Desconectado do MySQL");
}
    @Override
    public void teste(){
        System.out.println("Teste herança multipla");
    }
}
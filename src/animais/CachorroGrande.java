
package animais;


public class CachorroGrande extends Cachorro {
    @Override
    public void saudacao(){
        System.out.println("WOOOF!");
    }
    @Override
    public void saudacao(Cachorro amigo){
        saudacao();
        amigo.saudacao();
    }
}

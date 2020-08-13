
package animais;


public class Cachorro extends Animal {
    @Override
    public void saudacao(){
        System.out.println("Woof");
    }
    public void saudacao(Cachorro amigo){
        saudacao();
        amigo.saudacao();
    }
}

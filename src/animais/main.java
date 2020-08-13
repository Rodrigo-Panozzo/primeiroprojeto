
package animais;


public class main {
    public static void main(String[] args) {
        
        Animal an1 = new Animal ();
        an1.saudacao();
        
        Gato g1 = new Gato ();
        g1.saudacao();
        
        Cachorro c1 = new Cachorro ();
        c1.saudacao();
        c1.saudacao(c1);
        
        CachorroGrande cg1 = new CachorroGrande ();
        cg1.saudacao();
        cg1.saudacao(c1);
  
     
    }
    
}


package id;

import javax.swing.JOptionPane;



public class main {
    
    public static void main(String[] args) {
        IDb db;
        Iteste t = new MySQL();
        
        String acao = JOptionPane.showInputDialog("Qual banco você quer utilizar?");
        if (acao.equals("n")){
            db = new MySQL();        
        }else{
            db= new Oracle();
        }
    db.conectar();
    db.desconectar();
    
    t.teste();
    }
}

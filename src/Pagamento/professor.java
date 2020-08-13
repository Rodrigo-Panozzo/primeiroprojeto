
package Pagamento;


public class professor extends Funcionario {
    
    protected double juros=-0.05;
    
    @Override
    protected void salario(){
        super.salario();
        salario=salario*juros+salario;
        System.out.println("O salario do professor é: "+this.salario);
    }
}

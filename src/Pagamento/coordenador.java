
package Pagamento;


public class coordenador extends Funcionario {
    
    protected double juros=0.10;
    
    @Override
    protected void salario(){
        super.salario();
        salario=salario*juros+salario;
        System.out.println("O salario do professor é: "+this.salario);
    }
}

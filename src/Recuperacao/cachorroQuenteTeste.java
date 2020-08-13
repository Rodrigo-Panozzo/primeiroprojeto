
package Recuperacao;


public class cachorroQuenteTeste {

	public static void main(String[] args) {

		cachorroQuente c1 = new cachorroQuente();
		cachorroQuente c2 = new cachorroQuente();
		cachorroQuente c3 = new cachorroQuente();
		
		// Cria 3 pizzas com ingredientes diferentes
		c1.adicionaIngrediente("salsicha");
		c1.adicionaIngrediente("Mucarela");
		c1.adicionaIngrediente("Milho");
		
		c2.adicionaIngrediente("salsicha");
		c2.adicionaIngrediente("pure");
		c2.adicionaIngrediente("Mucarela");
		c2.adicionaIngrediente("batatinha");
		c2.adicionaIngrediente("maionese");
		c2.adicionaIngrediente("bacon");
		
		c3.adicionaIngrediente("salsicha");
		c3.adicionaIngrediente("milho");
		c3.adicionaIngrediente("Cheddar");
		
		CarrinhoDeCompras car = new CarrinhoDeCompras();
		
		// Adiciona essas Pizzas em um CarrinhoDeCompra
		car.addcachorroQuente(c1);
		car.addcachorroQuente(c2);
		car.addcachorroQuente(c3);
	
		// Imprime o total do CarrinhoDeCompra
		System.out.println("Total de Cachorro Quentes no carrinho: " +car.totalcachorroQuentes());
		System.out.println("Valor total da compra: " + car.getPrecoTotal());
		
		// Imprime a quantidade utilizada de cada ingrediente
		System.out.println("Lista de ingredientes utilizados: \n" +cachorroQuente.getListaIngredientes());
		

		
	}

}

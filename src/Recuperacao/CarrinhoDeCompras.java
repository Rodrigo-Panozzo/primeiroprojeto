
package Recuperacao;


import java.util.ArrayList;

public class CarrinhoDeCompras {
	
	private ArrayList <cachorroQuente> cachorroQuentes = new ArrayList <cachorroQuente>();
	private double precoTotal =0;
 
public void addcachorroQuente(cachorroQuente c)
 	{
		// Se a pizza nao tiver ingredientes
		// nao sera possivel adiciona-la ao carrinho
 		if (c.getIngrediente().isEmpty()){}
 		else
 		cachorroQuentes.add(c);
 	}

	
	public int totalcachorroQuentes()
	{
		return cachorroQuentes.size();
	}
	
	public double getPrecoTotal()
	{
		for(int i=0; i< cachorroQuentes.size(); i++)
		{
			precoTotal += cachorroQuentes.get(i).getPreco();	
		}
		return precoTotal;
	}

}

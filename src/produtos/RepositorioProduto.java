package produtos;

import java.util.HashMap;

public class RepositorioProduto {
	HashMap<Integer, Produto> produtos = new HashMap<Integer, Produto>();

	private int id = 0;

	public void criarProduto(String nome, String validade, double preco) {
		Produto produto = new Produto(nome, validade, preco);
		idProduto(produto);
		guardaProduto(produto);
	}

	public void guardaProduto(Produto produto) {
		produtos.put(produto.getId(), produto);
	}
	
	public void idProduto(Produto produto) {
		id++;
		produto.setId(id);
	}
}
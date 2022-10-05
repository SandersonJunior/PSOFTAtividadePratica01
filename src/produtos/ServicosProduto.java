package produtos;

import produtos.RepositorioProduto;

public class ServicosProduto {
	RepositorioProduto rp = new RepositorioProduto();

	public void criaProduto(String nome, String data, double preco) {
		rp.criarProduto(nome, data, preco);
	}
}

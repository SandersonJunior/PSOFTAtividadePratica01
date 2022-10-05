package lotes;

import produtos.Produto;

public class Lote {
	private int quantidade;
	private String dataValidade;
	Produto produto;

	public Lote(int quantidade, String dataValidade, Produto produto) {
		this.quantidade = quantidade;
		this.dataValidade = dataValidade;
		this.produto = produto;
	}
}

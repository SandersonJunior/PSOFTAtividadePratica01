package loja;

import lotes.Lote;
import produtos.Produto;

public class Cliente {

	public static void main(String args[]) {

		Produto p = new Produto("Leite", "Betânia", 10.00);
		Lote l = new Lote(100, "05/05/2025", p);
	}
}

package produtoselotes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Lote {
	private int quantidade;
	private Date dataValidade;
	Produto produto;

	private Date data = new Date();
	SimpleDateFormat sdf1= new SimpleDateFormat("dd/MM/yyyy");
	
	public Lote(int quantidade, Date data, Produto produto) {
		this.quantidade = quantidade;
		this.data = data;
		this.produto = produto;
	}
}

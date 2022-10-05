package produtos;

public class Produto {
	private String nome;
	private String fabricante;
	private double preco;
	private int id;

	public Produto(String nome, String fabricante, double preco) {
		this.nome = nome;
		this.fabricante = fabricante;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public String getFabricante() {
		return fabricante;
	}

	public double getPreco() {
		return preco;
	}

	public int getId() {
		return id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "| Produto: " + getNome() + " | Fabricante: " + getFabricante() + " | Preco: " + getPreco() + " |";
	}
}

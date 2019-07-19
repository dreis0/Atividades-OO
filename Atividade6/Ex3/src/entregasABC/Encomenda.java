package entregasABC;

public class Encomenda {
	private String descricao;
	private int quantidade;

	public Encomenda(int quantidade) {
		this.setQuantidade(quantidade);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int compareTo(Encomenda e) {
		if (this.getQuantidade() > e.getQuantidade())
			return 1;
		if (this.getQuantidade() < e.getQuantidade())
			return -1;
		return 0;
	}
}

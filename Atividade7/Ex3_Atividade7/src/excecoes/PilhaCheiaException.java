package excecoes;

public class PilhaCheiaException extends PilhaException {
	int limite;
	Object item;

	public PilhaCheiaException(int limite, Object item) {
		super("a pilha está cheia");
		this.limite = limite;
		this.item = item;
	}

	public int getLimite() {
		return this.limite;
	}

	public Object getItem() {
		return this.item;
	}
}

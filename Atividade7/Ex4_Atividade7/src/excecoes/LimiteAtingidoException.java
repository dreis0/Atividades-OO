package excecoes;

public class LimiteAtingidoException extends RuntimeException {
	public LimiteAtingidoException() {
		super("Limite de funcion�rios atingido");
	}
}

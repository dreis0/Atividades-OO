package excecoes;

public abstract class PilhaException extends RuntimeException {

	public PilhaException(String errorMessage) {
		super("Ação inválida: " + errorMessage);
	}
}

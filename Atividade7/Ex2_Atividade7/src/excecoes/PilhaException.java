package excecoes;

public abstract class PilhaException extends RuntimeException {

	public PilhaException(String errorMessage) {
		super("A��o inv�lida: " + errorMessage);
	}
}

package excecoes;

public class ValorNegativoException extends RuntimeException {

	public ValorNegativoException() {
		super("O(s) números(s) especificado(s) é(são) negativo(s)");
	}
}

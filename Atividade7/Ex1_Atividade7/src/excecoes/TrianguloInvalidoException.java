package excecoes;

import java.io.IOException;
import java.io.UncheckedIOException;

public class TrianguloInvalidoException extends Exception {

	public TrianguloInvalidoException() {
		super("O tri�ngulo especificado � inv�lido");
	}

}

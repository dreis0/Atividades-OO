package excecoes;

public class NaoHaFuncionariosCadastradosException extends RuntimeException {
	public NaoHaFuncionariosCadastradosException() {
		super("O arquivo de funcion�rios est� vazio");
	}
}

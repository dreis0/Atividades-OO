package excecoes;

public class NaoHaFuncionariosCadastradosException extends RuntimeException {
	public NaoHaFuncionariosCadastradosException() {
		super("O arquivo de funcionários está vazio");
	}
}

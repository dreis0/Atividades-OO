package excecoes;

public class FuncionarioNaoCadastradoException extends RuntimeException {
	
	public FuncionarioNaoCadastradoException() {
		super("Este funcionário não está cadastrado");
	}
}

package excecoes;

public class FuncionarioNaoCadastradoException extends RuntimeException {
	
	public FuncionarioNaoCadastradoException() {
		super("Este funcion�rio n�o est� cadastrado");
	}
}

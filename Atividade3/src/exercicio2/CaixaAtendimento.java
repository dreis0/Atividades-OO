package exercicio2;

public class CaixaAtendimento {

	int id;
	static int senha = 1;

	public CaixaAtendimento(int _id) {
		this.id = _id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public void chamaProximoFila() {
		System.out.println("Senha: " + getSenha() + "\nCaixa: " + id);
		senha++;
	}
}

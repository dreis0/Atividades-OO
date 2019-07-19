package funcionario;

public abstract class Funcionario {

	private String nome;
	private String cpf;
	private String setor;
	float totalHoras;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public float getTotalHoras() {
		return totalHoras;
	}
	
	public Funcionario(String pNome, String pCpf, String pSetor) {
		nome = pNome;
		cpf = pCpf;
		setor = pSetor;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append("Nome: " + getNome() + "\n");
		builder.append("CPF: " + getCpf() + "\n");
		builder.append("Setor: " + getSetor() + "\n");
		builder.append("Salário mensal: " + calculaSalarioMensal());

		return builder.toString();
	}

	public abstract float calculaSalarioMensal();

	public abstract void setSalario(float pSalario);
	
	public abstract void setTotalHoras(float horas);

}

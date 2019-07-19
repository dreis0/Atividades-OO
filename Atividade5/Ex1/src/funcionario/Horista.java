package funcionario;

public class Horista extends Funcionario {

	private float totalHoras;
	private float valorHora;

	public float getTotalHoras() {
		return totalHoras;
	}

	public void setTotalHoras(float totalHoras) {
		this.totalHoras = totalHoras;
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}

	public Horista(String pNome, String pCpf, String pSetor) {
		super(pNome, pCpf, pSetor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculaSalarioMensal() {
		if (totalHoras > 160)
			return valorHora * 160 + (totalHoras - 160) * valorHora * 1.4f;

		return valorHora * totalHoras;
	}

	@Override
	public void setSalario(float pSalario) {
		setValorHora(pSalario);
	}
}

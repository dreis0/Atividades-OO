package funcionario;

public class Efetivo extends Funcionario {

	private float salario;

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public float getHorasExtra() {
		return getTotalHoras() - 160 > 0 ? getTotalHoras() - 160 : 0;
	}

	public void setHorasExtra(float horasExtra) {
		setHorasExtra(getTotalHoras() + horasExtra);
	}

	public Efetivo(String pNome, String pCpf, String pSetor) {
		super(pNome, pCpf, pSetor);
	}

	@Override
	public float calculaSalarioMensal() {
		return salario + getHorasExtra() * (salario / 160f) * 1.5f;
	}

	@Override
	public void setTotalHoras(float horas) {
		super.totalHoras = horas;
	}
}

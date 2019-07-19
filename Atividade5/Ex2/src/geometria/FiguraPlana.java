package geometria;

public abstract class FiguraPlana {
	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public abstract float calculaArea();

	public abstract float calculaPerimetro();

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tipo: " + getTipo() + "\n");
		builder.append("Perímetro: " + calculaPerimetro() + "\n");
		builder.append("Área: " + calculaArea() + "\n");

		return builder.toString();
	}
}

package geometria;

public abstract class Poligono extends FiguraPlana {

	public float[] lados;

	public Poligono(int NumeroDeLados) {
		super.setTipo("Poligono");

		lados = new float[NumeroDeLados];
		for (int i = 0; i < lados.length; i++) {
			lados[i] = (float) Math.random();
		}
	}

	public Poligono(float[] lados) {
		this.lados = lados;
	}

	public float calculaPerimetro() {
		float perimetro = 0;

		for (int i = 0; i < lados.length; i++) {
			perimetro += lados[i];
		}
		return perimetro;
	}
}

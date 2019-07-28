package geometria;

import excecoes.ValorNegativoException;

public abstract class Poligono extends FiguraPlana {

	public float[] lados;

	public Poligono(int NumeroDeLados) throws ValorNegativoException {
		super.setTipo("Poligono");

		lados = new float[NumeroDeLados];
		for (int i = 0; i < lados.length; i++) {
			if (lados[i] < 0)
				throw new ValorNegativoException();
			lados[i] = (float) Math.random();
		}
	}

	public Poligono(float[] lados) {
		this.lados = lados;
		for (int i = 0; i < lados.length; i++) {
			if(lados[i] < 0)
				throw new ValorNegativoException();
		}
	}

	public float calculaPerimetro() {
		float perimetro = 0;

		for (int i = 0; i < lados.length; i++) {
			perimetro += lados[i];
		}
		return perimetro;
	}
}

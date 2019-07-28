package geometria;

import excecoes.TrianguloInvalidoException;

public class Triangulo extends Poligono {

	public Triangulo() throws TrianguloInvalidoException {
		super(3);
		if (!isValid())
			throw new TrianguloInvalidoException();
		setTipo("Triângulo");
	}

	public Triangulo(float l1, float l2, float l3) throws TrianguloInvalidoException {
		super(new float[] { l1, l2, l3 });
		if (!isValid())
			throw new TrianguloInvalidoException();
		setTipo("Triângulo");
	}

	private boolean isValid() {
		if (lados[0] + lados[1] <= lados[2])
			return false;
		if (lados[1] + lados[2] <= lados[0])
			return false;
		if (lados[0] + lados[2] < lados[1])
			return false;
		return true;
	}

	@Override
	public float calculaArea() {
		float p = calculaPerimetro() / 2;
		return (float) Math.sqrt(p * ((p - lados[0]) * (p - lados[1]) * (p - lados[2])));
	}
}

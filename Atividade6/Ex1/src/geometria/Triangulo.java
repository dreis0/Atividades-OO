package geometria;

public class Triangulo extends Poligono {

	public Triangulo() {
		super(3);
		setTipo("Triângulo");
	}

	public Triangulo(float l1, float l2, float l3) {
		super(new float[] { l1, l2, l3 });
		setTipo("Triângulo");
	}

	@Override
	public float calculaArea() {
		float p = calculaPerimetro() / 2;
		return (float) Math.sqrt(p * ((p - lados[0]) * (p - lados[1]) * (p - lados[2])));
	}
}

package geometria;

public class Retangulo extends Poligono {

	public Retangulo(float base, float altura) {
		super(new float[] { base, altura, base, altura });
		super.setTipo("Retangulo");
	}

	@Override
	public float calculaArea() {
		return lados[0] * lados[1];
	}


}

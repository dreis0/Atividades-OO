package geometria;

import excecoes.ValorNegativoException;

public class Circulo extends FiguraPlana {

	private float raio;

	public Circulo(float r) {
		super.setTipo("Circulo");
		if(r < 0)
			throw new ValorNegativoException();
		raio = r;
	}

	public Circulo() {
		super.setTipo("Circulo");
		raio = (float) Math.random();
	}

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

	@Override
	public float calculaArea() {
		return (float) (Math.PI * Math.pow(raio, 2));
	}

	@Override
	public float calculaPerimetro() {
		return (float) (Math.PI * raio * 2);
	}
}

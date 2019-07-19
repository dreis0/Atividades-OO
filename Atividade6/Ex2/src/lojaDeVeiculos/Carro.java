package lojaDeVeiculos;

public class Carro extends Veiculo {
	private int numPortas;

	public Carro(String placa, int ano, int numPortas) {
		super(placa, ano, "Carro");
		this.numPortas = numPortas;
	}

	public int getNumPortas() {
		return this.numPortas;
	}
	
	@Override
	protected float calcula() {
		return this.precoTabelaFipe * 0.03f;
	}
	
	@Override
	public String toString() {
		return super.toString()
			+ "Número de portas: " + this.numPortas;
	}

}

package lojaDeVeiculos;

public class Moto extends Veiculo {
	private int cilindradas;

	public Moto(String placa, int ano, int cilindradas) {
		super(placa, ano, "Moto");
		this.cilindradas = cilindradas;
	}

	public int getCilindradas() {
		return this.cilindradas;
	}

	@Override
	protected float calcula() {
		return this.precoTabelaFipe * 0.02f;
	}

	@Override
	public String toString() {
		return super.toString() + "Cilindradas: " + this.cilindradas;
	}

}

package lojaDeVeiculos;

public class Caminhao extends Veiculo {
	private int eixos;
	private float capacidade;
	
	public Caminhao(String placa, int ano, int eixos, float capacidade){
		super(placa, ano, "Caminhao");
		this.eixos = eixos;
		this.capacidade = capacidade;
	}

	public int getEixos() {
		return this.eixos;
	}
	
	public float getCapacidade() {
		return this.capacidade;
	}
	
	public float calcula() {
		return this.precoTabelaFipe * 0.015f;
	}
	
	@Override
	public String toString() {
		return super.toString()
			+ "Eixos: " + this.eixos
			+ "\n Capacidade: " + this.capacidade;
	}
}

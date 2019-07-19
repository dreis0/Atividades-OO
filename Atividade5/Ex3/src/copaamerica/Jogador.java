package copaamerica;

public class Jogador {
	protected int numero;
	protected String posicao;
	
	public Jogador(int pNumero, String pPosicao) {
		this.numero = pNumero;
		this.posicao = pPosicao;
	}
	
	public String getPosicao() {
		return posicao;
	}
	
	@Override
	public String toString() {
		return "Posi��o: " + this.posicao + " N�mero: " + this.numero + "\n";
	}
}

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
		return "Posição: " + this.posicao + " Número: " + this.numero + "\n";
	}
}

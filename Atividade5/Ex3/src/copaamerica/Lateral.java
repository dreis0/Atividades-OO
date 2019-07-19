package copaamerica;

public class Lateral extends Jogador{
	public enum Lado{
		Direito,
		Esquerdo
	}
	
	protected String lado;
	
	public Lateral(int pNumero, Lado pLado) {
		super(pNumero, "Lateral");
		lado = pLado.toString();
	}
	
	
	@Override
	public String toString() {
		return "Posição: " + this.posicao + " " + this.lado.toString() + " Número: " + this.numero + "\n";
	}
}

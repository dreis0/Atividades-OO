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
		return "Posi��o: " + this.posicao + " " + this.lado.toString() + " N�mero: " + this.numero + "\n";
	}
}

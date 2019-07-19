package lojaDeVeiculos;

public class Loja implements ILoja{
	public Veiculo[] veiculos;
	
	public Loja(Veiculo[] veiculos) {
		this.veiculos = veiculos;
	}

	@Override
	public float calculaTodosIpvasMes() {
		float acc = 0;
		for (Veiculo veiculo : veiculos) {
			if(veiculo != null)
				acc += veiculo.calculaIpva();
		}
		
		return acc;
	}

	@Override
	public float calculaTodosIpvasAno() {
		float acc = 0;
		for (Veiculo veiculo : veiculos) {
			if(veiculo != null)
				acc += veiculo.calculaIpvaAnual();
		}
		
		return acc;
	}

	
}

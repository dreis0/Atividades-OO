package lojaDeVeiculos;

import java.util.*;

public abstract class Veiculo implements IPagamento {
	protected String tipo;
	protected String modelo;
	protected int ano;
	protected float precoTabelaFipe;
	protected String placa;

	public Veiculo(String placa, int ano, String tipo) {
		this.placa = placa;
		this.ano = ano;
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public String getPlaca() {
		return placa;
	}

	public float getPrecoTabelaFipe() {
		return precoTabelaFipe;
	}

	public void setPrecoTabelaFipe(float precoTabelaFipe) {
		this.precoTabelaFipe = precoTabelaFipe;
	}

	public void trocarPlaca(String novaPlaca) {
		this.placa = novaPlaca;
	}

	protected abstract float calcula();

	public float calculaIpva() {
		Calendar data = Calendar.getInstance();
		if (2019 - data.get(Calendar.YEAR) > 20)
			return calcula();
		return 0;
	}

	public float calculaIpvaAnual() {
		return this.calculaIpva() * 12;
	}
	
	public String toString() {
		return "IPVA mensal: " + this.calculaIpva()
				+ "\n IPVA anual: " + this.calculaIpvaAnual()
				+ "\n Tipo: " + this.tipo 
				+ "\n Placa: " + this.placa
				+ "\n Ano: " + this.ano + "\n";
	}
}

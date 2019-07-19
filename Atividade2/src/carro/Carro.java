package carro;

public class Carro {
	public Carro(double maxTanque) {
		this.maxTanque = maxTanque;	
	}
	private double maxTanque;
	
	String modelo;
	
	String tipoCombustivel;
	
	double quantidadeCombustivel;
	
	double consumo; //km/L
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public double getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}

	public void setQuantidadeCombustivel(int quantidadeCombustivel) {
		this.quantidadeCombustivel = quantidadeCombustivel;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	public void abastecer(double litros) {
		if(litros <= 0 ) System.out.println("Não é possível abastecer com valor nulo ou vazio");
		else if(quantidadeCombustivel + litros > maxTanque) System.out.println("Tanque não comporta essa quantidade");
		else quantidadeCombustivel += litros;
	}
	
	public double quantidadeNecessaria(double dist) {
		if(dist < 0) System.out.println("Distância não pode ser negativa");
		return dist/consumo;
	}
	
	public int percorrerDistancia(double dist) {
		if(quantidadeCombustivel >= dist/consumo) {
			quantidadeCombustivel -= dist/consumo;
			return 1;
		}
		else {
			System.out.println("Não há combustível suficiente");
			return -1;
		}
	}
	
	public void printInfo() {
		System.out.print("Modelo: ");
		System.out.println(this.modelo);
		System.out.print("Tipo combustível: ");
		System.out.print(this.tipoCombustivel);
		System.out.print("Máximo tanque: ");
		System.out.println(this.maxTanque);
		System.out.print("Combustível: ");
		System.out.println(this.quantidadeCombustivel);
		System.out.print("Consumo por litro: ");
		System.out.println(this.consumo);
	}
}

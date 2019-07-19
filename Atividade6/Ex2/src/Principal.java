import lojaDeVeiculos.*;

public class Principal {
	public static void main(String[] args) {
		Veiculo[] veiculos = new Veiculo[5];
		
		veiculos[0] = new Caminhao("abc-1234", 1980, 1, 1234);
		veiculos[1] = new Caminhao("def-5678", 2019, 4, 12345);
		veiculos[2] = new Carro("aei-1234", 1995, 4);
		veiculos[3] = new Carro("abc-9876", 2018, 90);
		veiculos[4] = new Moto("abc-2468", 2010, 100);
		
		Loja loja = new Loja(veiculos);
		
		for (Veiculo veiculo : veiculos) 
			System.out.println(veiculo.toString());
		
		System.out.println("IPVA mensal da loja: " + loja.calculaTodosIpvasMes());
		System.out.println("IPVA anual da loja: " + loja.calculaTodosIpvasAno());
	}

}

package racional;

import loteria.NumeroAleatorio;

public class NumeroRacional {
	int numerador;
	int denominador;

	public NumeroRacional(int pNumerador, int pDenominador) {
		if (pDenominador == 0) {
			System.out.println("Denominador não pode ser zero");
			throw new IllegalArgumentException();
		}
		numerador = pNumerador;
		denominador = pDenominador;
		simplificar();
	}

	public NumeroRacional() {
		numerador = NumeroAleatorio.getAleatorio();
		denominador = NumeroAleatorio.getAleatorio();
		simplificar();
	}

	private void simplificar() {
		if (numerador == 0)
			denominador = 1;
		else {
			int menor = numerador > denominador ? denominador : numerador;
			int divisor = 1;
			for (int i = 2; i <= menor; i++) {
				if ((numerador % i == 0) && (denominador % i == 0))
					divisor = i;
			}
			numerador /= divisor;
			denominador /= divisor;
		}
	}

	public NumeroRacional soma(NumeroRacional num) {
		int novoNumerador = numerador * num.denominador + num.numerador * denominador;
		int novoDenominador = denominador * num.denominador;

		return new NumeroRacional(novoNumerador, novoDenominador);
	}

	public String toString() {
		return numerador + "/" + denominador;
	}
}

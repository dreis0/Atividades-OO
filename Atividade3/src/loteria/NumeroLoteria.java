package loteria;

public class NumeroLoteria {
	int[] numeros;

	public int[] getNumeros() {
		return numeros;
	}

	public void setNumeros(int[] pNumeros) {
		numeros = pNumeros;
	}

	public NumeroLoteria() {
		numeros = new int[3];
		for (int i = 0; i < 3; i++)
			numeros[i] = (int) (NumeroAleatorio.getAleatorio());
	}

	public NumeroLoteria(int[] pNumeros) {
		numeros = pNumeros;
	}

	public String toString() {
		String result = "";

		for (int i = 0; i < numeros.length; i++)
			result += numeros[i] + ", ";

		return result.substring(0, result.length() - 2);
	}

	public boolean ganhou(NumeroLoteria nLoteria) {
		for (int i = 0; i < nLoteria.numeros.length; i++)
			for (int j = 0; j < numeros.length; j++)
				if (this.numeros[j] == nLoteria.numeros[j])
					return true;

		return false;
	}

}

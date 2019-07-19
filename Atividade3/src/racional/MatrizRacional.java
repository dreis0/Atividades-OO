package racional;

public class MatrizRacional {
	NumeroRacional[][] matriz;

	public MatrizRacional() {
		matriz = new NumeroRacional[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = new NumeroRacional();
			}
		}
	}

	public MatrizRacional(int N, int M) {
		matriz = new NumeroRacional[N][M];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				matriz[i][j] = new NumeroRacional(0, 1);
			}
		}
	}

	public MatrizRacional soma(MatrizRacional m) {
		if (matriz.length != m.matriz.length || matriz[0].length != m.matriz[0].length)
			System.out.println("Tamanho inválido");
		else {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[0].length; j++) {
					NumeroRacional aux = m.matriz[i][j];
					m.matriz[i][j] = m.matriz[i][j].soma(matriz[i][j]);
				}
			}
		}
		return m;
	}
	
	public void imprimir() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j].toString() + ", ");
			}
			System.out.println();
		}
	}
}

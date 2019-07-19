import geometria.*;

public class CriaFiguras {

	public static void main(String[] args) {
		FiguraPlana[] figuras = new FiguraPlana[4];

		figuras[0] = new Circulo(4.0f);
		figuras[1] = new Quadrado(5.0f);
		figuras[2] = new Retangulo(6, 7);
		figuras[3] = new Triangulo(8, 9, 10);

		for (int i = 0; i < figuras.length; i++) {
			System.out.println(figuras[i]);
		}
	}
}

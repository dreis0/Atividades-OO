import excecoes.*;
import geometria.*;

public class CriaFiguras {

	public static void main(String[] args) {
		FiguraPlana[] figuras = new FiguraPlana[4];

		try {
			figuras[0] = new Circulo(4.0f);
			figuras[1] = new Quadrado(5.0f);
			figuras[2] = new Retangulo(6, 7);
			figuras[3] = new Triangulo(8, 9, 40);

		} catch (ValorNegativoException e) {
			System.out.println(e.getMessage());
		}catch(TrianguloInvalidoException e) {
			System.out.println(e.getMessage());
		}

		for (FiguraPlana figura : figuras) {
			System.out.println(figura);
		}
	}
}

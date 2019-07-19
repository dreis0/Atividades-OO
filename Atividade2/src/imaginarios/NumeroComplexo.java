package imaginarios;

public class NumeroComplexo {
	private double a;
	private double b;

	public static NumeroComplexo inicializaNumero(double a, double b) {
		NumeroComplexo i = new NumeroComplexo();
		i.a = a;
		i.b = b;

		return i;
	}

	public void imprimeNumero() {
		System.out.print(this.a);
		if (this.b > 0) {
			System.out.print(" + ");
			System.out.print(this.b);
			System.out.println("i");
		} else if (this.b < 0) {
			System.out.print(" - ");
			System.out.print(-this.b);
			System.out.println("i");
		}
	}

	public boolean ehIgual(NumeroComplexo i) {
		return (this.a == i.a && this.b == i.b);
	}

	public NumeroComplexo soma(NumeroComplexo i) {
		return NumeroComplexo.inicializaNumero((this.a + i.a), (this.b + i.b));
	}

	public NumeroComplexo subtrai(NumeroComplexo i) {
		return NumeroComplexo.inicializaNumero((this.a - i.a), (this.b - i.b));
	}

	public NumeroComplexo multiplica(NumeroComplexo i) {
		double resultadoTermoA = (this.a * i.a) - (this.b * i.b);
		double resultadoTermoB = (this.a * i.b + this.b * i.a);

		return NumeroComplexo.inicializaNumero(resultadoTermoA, resultadoTermoB);
	}

	public NumeroComplexo divide(NumeroComplexo i) {
		double resultadoTermoA = (this.a * i.a + this.b * i.b) / (i.a * i.a + i.b * i.b);
		double resultadoTermoB = (this.b * i.a - this.a * i.b) / (i.a * i.a + i.b * i.b);

		return NumeroComplexo.inicializaNumero(resultadoTermoA, resultadoTermoB);
	}
}

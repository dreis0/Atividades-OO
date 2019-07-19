import java.util.Scanner;
import exercicio2.Principal;
import loteria.NumeroAleatorio;
import loteria.NumeroLoteria;
import racional.MatrizRacional;
import racional.NumeroRacional;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrimeiroExercicio(sc);
		Principal.Exercicio(sc);
		TerceiroExercicio(sc);
		QuartoExercicio();
		QuintoExercicio();
	}

	public static void PrimeiroExercicio(Scanner sc) {
		System.out.println("Digite um valor em Celsius: ");
		double c = sc.nextDouble();
		System.out.print("Para farenheit: ");
		System.out.println(ConversaoDeTemperatura.celsiusParaFarenheit(c));
		System.out.print("Para Kelvin: ");
		System.out.println(ConversaoDeTemperatura.celsiusParaKelvin(c));

		System.out.println("Digite um valor em Farenheit: ");
		double f = sc.nextDouble();
		System.out.print("Para celsius: ");
		System.out.println(ConversaoDeTemperatura.farenheitParaCelsius(f));
		System.out.print("Para Kelvin: ");
		System.out.println(ConversaoDeTemperatura.farenheitParaKelvin(f));

		System.out.println("Digite um valor em Kelvin: ");
		double k = sc.nextDouble();
		System.out.print("Para celsius: ");
		System.out.println(ConversaoDeTemperatura.kelvinParaCelsius(k));
		System.out.print("Para farenheit: ");
		System.out.println(ConversaoDeTemperatura.kelvinParaFarenheit(k));
	}

	public static void TerceiroExercicio(Scanner sc) {
		System.out.println("Escolha a quantidade de sorteios: ");
		int sorteios = sc.nextInt();

		for (int i = 0; i < sorteios; i++) {
			NumeroLoteria num1 = new NumeroLoteria();
			int[] aux = new int[3];
			for (int j = 0; j < 3; j++) {
				System.out.println("Escolha o " + (j + 1) + "º número:");
				aux[j] = sc.nextInt();
			}
			NumeroLoteria num2 = new NumeroLoteria(aux);
			System.out.print("Sorteados: ");
			System.out.println(num1.toString());
			System.out.print("Escolhidos: ");
			System.out.println(num2.toString());

			if (num1.ganhou(num2))
				System.out.print("Ganhou");
			else
				System.out.print("Perdeu");
		}
	}

	public static void QuartoExercicio() {
		NumeroRacional n1 = new NumeroRacional();
		System.out.println("n1: " + n1.toString());
		NumeroRacional n2 = new NumeroRacional(6, 18);
		System.out.println("n2: " + n2.toString());
		NumeroRacional n3 = new NumeroRacional(1, 5);
		System.out.println("n3: " + n3.toString());

		System.out.println("Soma n1 + n2: " + n1.soma(n2).toString());
		System.out.println("Soma n1 + n3: " + n1.soma(n3).toString());
		System.out.println("Soma n2 + n3: " + n2.soma(n3).toString());
	}

	public static void QuintoExercicio() {
		MatrizRacional m1 = new MatrizRacional();
		System.out.println("m1: ");
		m1.imprimir();

		MatrizRacional m2 = new MatrizRacional();
		System.out.println("m2: ");
		m2.imprimir();

		System.out.println("m1 + m2: ");
		m1.soma(m2).imprimir();

		MatrizRacional m3 = new MatrizRacional(3, 3);
		System.out.println("m3: ");
		m3.imprimir();

		System.out.println("m1 + m3: ");
		m1.soma(m3).imprimir();

		MatrizRacional m4 = new MatrizRacional(2, 2);
		System.out.println("m4: ");
		m4.imprimir();

		System.out.println("m1 + m4: ");
		m1.soma(m4).imprimir();

	}
}

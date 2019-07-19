import java.util.Random;
import java.util.Scanner;

import carro.Carro;
import imaginarios.NumeroComplexo;
import pessoa.*;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrimeiroExercicio(sc);
		SegundoExercicio(sc);
		TerceiroExercicio(sc);
		QuartoExercicio(sc);

	}

	static void PrimeiroExercicio(Scanner sc) {

		for (int i = 0; i < 3; i++) {
			Pessoa p = new Pessoa();

			System.out.println("Digite o nome");
			p.setNome(sc.nextLine());

			System.out.println("Digite o telefone e o email");
			p.alterTelefoneEmail(sc.nextLine(), sc.nextLine());

			p.printInfo();
		}
	}

	static void SegundoExercicio(Scanner sc) {
		Agenda agenda = new Agenda(10);

		for (int i = 0; i < 3; i++) {
			Pessoa p = new Pessoa();
			p.setNome("Miguel");
			p.alterTelefoneEmail("111", "email");
			agenda.addPessoa(p);
		}

		for (int j = 0; j < 4; j++) {
			agenda.removeByNome("M");
		}
	}

	static void TerceiroExercicio(Scanner sc) {
		Carro c = new Carro(100);

		for (int i = 0; i < 3; i++) {
			System.out.println("Digite o modelo: ");
			c.setModelo(sc.nextLine());
			System.out.println("Digite o tipo do combustível: ");
			c.setTipoCombustivel(sc.nextLine());
			System.out.println("Abasteça: ");
			c.abastecer(sc.nextDouble());
			System.out.println("Percorrer distância: ");
			c.percorrerDistancia(sc.nextDouble());

			c.printInfo();
		}

	}

	static void QuartoExercicio(Scanner sc) {
		Random rnd = new Random();

		for (int i = 0; i < 5; i++) {
			NumeroComplexo n1 = NumeroComplexo.inicializaNumero(rnd.nextDouble(), rnd.nextDouble());
			System.out.print("n1: ");
			n1.imprimeNumero();

			NumeroComplexo n2 = NumeroComplexo.inicializaNumero(rnd.nextDouble(), rnd.nextDouble());
			System.out.print("n2: ");
			n2.imprimeNumero();

			System.out.println();

			System.out.print("Iguais: ");
			System.out.println(n1.ehIgual(n2));

			System.out.println();

			System.out.print("Soma: ");
			NumeroComplexo soma = n1.soma(n2);
			soma.imprimeNumero();

			System.out.println();

			System.out.print("Subtração: ");
			NumeroComplexo sub = n1.subtrai(n2);
			sub.imprimeNumero();

			System.out.println();

			System.out.print("Multiplicação: ");
			NumeroComplexo mult = n1.multiplica(n2);
			mult.imprimeNumero();

			System.out.println();

			System.out.print("Divisão n1/n2: ");
			NumeroComplexo div = n1.divide(n2);
			div.imprimeNumero();

			System.out.println();

			System.out.print("Divisão n2/n1: ");
			NumeroComplexo outraDiv = n2.divide(n1);
			outraDiv.imprimeNumero();
		}
	}
}

package exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Principal {
	public static void Exercicio(Scanner sc) {
		List<CaixaAtendimento> caixas = new ArrayList();

		for (int i = 1; i <= 5; i++)
			caixas.add(new CaixaAtendimento(i));
		
		while (true) {
			caixas.get((int) (Math.random() * 5)).chamaProximoFila();

			System.out.println(" 'F' para Finalizar ou outra tecla para continuar");

			if (sc.nextLine() == "f" || sc.nextLine() == "F")
				break;
		}
	}
}

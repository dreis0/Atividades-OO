import java.util.Scanner;

import jdk.nashorn.internal.ir.debug.PrintVisitor;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		PrimeiroExercicio(sc);
		SegundoExercicio(sc);
		TerceiroExercicio(sc);
		QuartoExercicio(sc);
		QuintoExercicio();
		
		sc.close();
	}

	public static void PrimeiroExercicio(Scanner sc) {
		System.out.println("Ex1) PI utilizando a série de Gregory: ");
		System.out.println("Digite o número de termos: ");
		int n = sc.nextInt();
		System.out.println(Ex1.CalculatePI(n));
		System.out.println();
	}

	public static void SegundoExercicio(Scanner sc) {
		System.out.println("Ex2) ");
		System.out.println("Digite o número de termos: ");
		Ex2.terms = sc.nextInt();
		int[] arr = Ex2.getArr();

		PrintArray(arr);

		System.out.print("Média: ");
		System.out.println(Ex2.Average(arr));
		System.out.print("Moda: ");
		System.out.println(Ex2.Moda(arr));
	}

	public static void TerceiroExercicio(Scanner sc) {
		System.out.println("Ex3) ");

		System.out.println("Digite o nº de colunas da primeira matriz: ");
		int Ah = sc.nextInt();
		System.out.println("Digite o nº de linhas da primeira matriz: ");
		int Aw = sc.nextInt();
		int[][] A = new int[Ah][Aw];

		System.out.println("Digite o nº de colunas da segunda matriz: ");
		int Bh = sc.nextInt();
		System.out.println("Digite o nº de linhas da segunda matriz: ");
		int Bw = sc.nextInt();
		int[][] B = new int[Bh][Bw];

		if (Aw != Bh) {
			System.out.println("Não é possível realizar o produto");
			return;
		}
		A = Ex3.FillMatrix(A, Ah, Aw);
		B = Ex3.FillMatrix(B, Bh, Bw);

		System.out.println("Primeira matriz: ");
		PrintMatrix(A, Ah, Aw);
		System.out.println("Segunda matriz: ");
		PrintMatrix(B, Bh, Bw);
		System.out.println("Resultado: ");
		PrintMatrix(Ex3.MultiplyMatrix(A, B), Ah, Bw);
	}

	public static void QuartoExercicio(Scanner sc) {
		System.out.println("Ex4) ");

		System.out.println("Digite a posição: ");
		int position = sc.nextInt();
		System.out.println("Digite o valor");
		int value = sc.nextInt();

		Ex2.terms = 10;
		int[] arr = Ex2.getArr();
		PrintArray(arr);
		if (Ex4.isFilled(arr)) {
			System.out.println("Vetor cheio");
			return;
		}

		if (!Ex4.canInsert(arr, position)) {
			System.out.println("Impossivel inserir nessa posição");
			return;
		}

		System.out.println("Resultado");
		PrintArray(Ex4.Insert(arr, position, value));

	}

	public static void QuintoExercicio() {
		Ex2.terms = 10;
		int[] arr = Ex2.getArr();
		System.out.println("Não ordenado: ");
		PrintArray(arr);
		System.out.println("Ordenado: ");
		PrintArray(Ex5.sort(arr));
	}

	public static void PrintArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);

			if (i < arr.length - 1)
				System.out.print(", ");
			else
				System.out.println();
		}
	}

	public static void PrintMatrix(int[][] m, int h, int w) {
		System.out.println("Matriz: ");
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				System.out.print(m[i][j]);
				if (j < w - 1)
					System.out.print(", ");
			}
			System.out.println();
		}
	};
}

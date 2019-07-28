import estrutura.*;
import excecoes.PilhaCheiaException;
import excecoes.PilhaVaziaException;

public class TesteEstruturas {
	public static void main(String[] args) {

		System.out.println("--- Teste 1 ---");
		try (PilhaAprimorada pilha = new PilhaAprimorada(3)) {
			try {
				pilha.empilha("10");
				pilha.empilha("20");
				pilha.empilha("30");
				pilha.empilha("40");
				System.out.println(pilha.desempilha());
				System.out.println(pilha.desempilha());
				System.out.println(pilha.desempilha());
				System.out.println(pilha.desempilha());

				System.out.println();
			} catch (PilhaVaziaException e) {
				System.out.println(e);
			} catch (PilhaCheiaException e) {
				System.out.println(e);
				System.out.println("Limite eh " + e.getLimite());
				System.out.println("Item eh " + e.getItem());
			}
		} catch (Exception e) {
		}

		System.out.println();
		System.out.println("--- Teste 2 ---");

		try (PilhaAprimorada pilha = new PilhaAprimorada(3)) {
			try {

				pilha.empilha("10");
				pilha.empilha("20");
				pilha.empilha("30");
				System.out.println(pilha.desempilha());
				System.out.println(pilha.desempilha());
				System.out.println(pilha.desempilha());
				System.out.println(pilha.desempilha());

				System.out.println();
			} catch (PilhaVaziaException e) {
				System.out.println(e);
			} catch (PilhaCheiaException e) {
				System.out.println(e);
				System.out.println("Limite eh " + e.getLimite());
				System.out.println("Item eh " + e.getItem());
			}
		} catch (Exception e) {
		}

		System.out.println();
	}

}
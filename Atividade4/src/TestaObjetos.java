import listaLigada.ListaLigada;

public class TestaObjetos {

	public static void main(String[] args) {
		ListaLigada listaL = new ListaLigada();
		listaL.adicionaItemNoFinal(5);
		listaL.adicionaItemNoFinal(20);
		listaL.adicionaItemNoFinal(35);
		listaL.adicionaItemNoFinal(70);
		listaL.adicionaItemNoFinal(100);
		listaL.imprimeListaLigada();
		// listaL.reverse();
		listaL.adicionaItemOrdenado(101);
		listaL.imprimeListaLigada();
		System.out.println(listaL.exists(5));
	}

}

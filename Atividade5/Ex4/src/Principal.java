
public class Principal {

	public static void main(String[] args) {
		ListaLigadaPessoa lista = new ListaLigadaPessoa();
		for (int i = 0; i < 5; i++) {
			Pessoa novaPessoa = new Pessoa();
			novaPessoa.setNome("Miguel " + i);
			novaPessoa.setEmail("Miguel " + i);
			novaPessoa.setTelefone("00000 - 000" + i);
			lista.adicionaItemNoFinal(novaPessoa);
		}

		lista.imprimeListaLigada();
		Pessoa teste = new Pessoa();
		teste.setEmail("Miguel 2");
		teste.setNome("Miguel 2");
		teste.setTelefone("00000 - 0002");
		System.out.println(lista.exists(teste));
		lista.imprimeListaLigada();
		lista.remove(teste);
		lista.imprimeListaLigada();
		lista.reverse();
		lista.imprimeListaLigada();
	}
}

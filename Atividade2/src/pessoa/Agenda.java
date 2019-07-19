package pessoa;

public class Agenda {

	public Agenda(int pSize) {
		lista = new Pessoa[pSize];
	}

	private static Pessoa[] lista;

	public Pessoa[] getLista() {
		return lista;
	}

	public boolean isFull() {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == null)
				return false;
		}
		return true;
	}

	public void addPessoa(Pessoa p) {
		if (isFull()) {
			System.out.println("Agenda cheia");
			return;
		}

		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == null) {
				lista[i] = p;
				break;
			}
		}

	}

	public void removeByIdx(int idx) {
		if (lista[idx] != null) {
			lista[idx] = null;
			System.out.println("Pessoa removida com sucesso!");
		} else
			System.out.println("Posição vazia");
	}

	public void removeByNome(String nome) {
		int idx = findByNome(nome);
		if (idx == -1) {
			System.out.println("Pessoa não encontrada");
			return;
		}
		lista[idx] = null;
		System.out.println("Pessoa removida com sucesso!");
	}

	public int findByNome(String nome) {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == null)
				continue;
			if (lista[i].getNome().contains(nome))
				return i;
		}
		return -1;
	}

	public String findTelefoneByNome(String nome) {
		int idx = findByNome(nome);
		if (idx == -1) {
			System.out.println("Pessoa não encontrada");
			return "";
		}
		return lista[idx].getTelefone();
	}

	public String findEmailByNome(String nome) {
		int idx = findByNome(nome);
		if (idx == -1) {
			System.out.println("Pessoa não encontrada");
			return "";
		}
		return lista[idx].getEmail();
	}

	public void printByIdx(int idx) {
		if (lista[idx] == null)
			System.out.println("Posição vazia");
		else
			lista[idx].printInfo();
	}

	public void printByNome(String nome) {
		int idx = findByNome(nome);
		if (idx == -1) {
			System.out.println("Pessoa não encontrada");
			return;
		}
		lista[idx].printInfo();
	}
}

public class ListaLigadaPessoa {
	private class PessoaNode {
		Pessoa data;
		PessoaNode next;
	}

	PessoaNode first;

	public void adicionaItemNoFinal(Pessoa novaPessoa) {
		PessoaNode newNode = new PessoaNode();
		newNode.data = novaPessoa;

		if (this.first == null) {
			this.first = newNode;
		} else {
			PessoaNode anterior = null;
			PessoaNode atual = first;
			while (atual != null) {
				anterior = atual;
				atual = atual.next;
			}
			anterior.next = newNode;
		}
	}

	public void remove(Pessoa p) {
		PessoaNode previous = null;
		PessoaNode current = first;

		while (current != null && !current.data.equals(p)) {
			previous = current;
			current = current.next;
		}

		if (current != null) {
			if (previous == null) {
				first = current.next;
			}
			previous.next = current.next;
		} else {
			System.out.println("Item não encontrado");
		}
	}

	public void imprimeListaLigada() {
		if (this.first == null) {
			System.out.println("Lista vazia");
		} else {
			PessoaNode current = this.first;
			while (current != null) {
				current.data.printInfo();
				current = current.next;
			}
			System.out.println();
		}

	}

	public boolean exists(Pessoa p) {
		if (this.first.data.equals(p)) {
			return true;
		} else {
			PessoaNode current = this.first;
			while (current != null) {
				if (current.data.equals(p))
					return true;
				current = current.next;
			}
			return false;
		}
	}

	public void reverse() {
		PessoaNode prev = null;
		PessoaNode current = this.first;
		PessoaNode next = null;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		this.first = prev;
	}
}

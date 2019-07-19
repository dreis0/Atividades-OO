package listaLigada;

public class ListaLigada {
	private class LinkedNode {
		int data;
		LinkedNode next;
	}

	private LinkedNode first = null;

	public void adicionaItemNoFinal(int item) {
		LinkedNode newNode = new LinkedNode();
		newNode.data = item;

		if (this.first == null) {
			this.first = newNode;
		} else {
			LinkedNode anterior = null;
			LinkedNode atual = first;
			while (atual != null) {
				anterior = atual;
				atual = atual.next;
			}
			anterior.next = newNode;
		}

	}

	public void adicionaItemOrdenado(int item) {
		LinkedNode newNode = new LinkedNode();
		newNode.data = item;

		if (first == null) {
			first = newNode;
			return;
		}

		LinkedNode current = first;
		LinkedNode next = first.next;

		if (item < this.first.data) {
			newNode.next = this.first;
			this.first = newNode;
			return;
		}

		while (next.data < item) {
			current = next;
			next = next.next;
			if (next == null)
				break;
		}

		current.next = newNode;
		newNode.next = next;
	}

	public void removeItem(int item) {
		LinkedNode previous = null;
		LinkedNode current = first;

		while (current != null && current.data != item) {
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
			LinkedNode current = this.first;
			while (current != null) {
				System.out.print(current.data + ", ");
				current = current.next;
			}
			System.out.println();
		}

	}

	public boolean exists(int item) {
		if (this.first.data == item) {
			return true;
		} else {
			LinkedNode current = this.first;
			while (current != null) {
				if (current.data == item)
					return true;
				current = current.next;
			}
			return false;
		}
	}

	public void reverse() { 	// 5 25 35 70 100
		LinkedNode prev = null;
		LinkedNode current = this.first;
		LinkedNode next = null;
		
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		this.first = prev;
	}

}

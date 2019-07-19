package lista;

import entregasABC.Encomenda;

public class ListaEncomenda extends Lista<Encomenda> {

	@Override
	public void add(Encomenda item) {
		Node<Encomenda> newNode = new Node<Encomenda>();
		newNode.value = item;

		if (first == null)
			first = newNode;

		Node<Encomenda> current = first;
		Node<Encomenda> next = first.next;

		if (item.compareTo(first.value) <= -1) {
			newNode.next = first;
			first = newNode;
			return;
		}

		while (current.value.compareTo(item) < 1) {
			current = next;
			next = next.next;
		}

		current.next = newNode;
		if (next != null)
			newNode.next = next;
		else
			next = newNode;

	}

}

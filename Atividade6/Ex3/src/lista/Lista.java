package lista;

import java.util.function.Function;

public class Lista<T> {

	public class Node<T> {
		public Node() {}

		T value;
		Node<T> next;
	}

	Node<T> first;

	public void add(T item) {
		Node<T> newNode = new Node<T>();
		newNode.value = item;

		if (this.first == null) {
			this.first = newNode;
		} else {
			Node<T> anterior = null;
			Node<T> atual = first;
			while (atual != null) {
				anterior = atual;
				atual = atual.next;
			}
			anterior.next = newNode;
		}
	}

	public boolean exists(T item) {
		if (this.first.value == item) {
			return true;
		} else {
			Node<T> current = this.first;
			while (current != null) {
				if (current.value == item)
					return true;
				current = current.next;
			}
			return false;
		}
	}

	public void remove(T item) {
		Node<T> previous = null;
		Node<T> current = first;

		while (current != null && current.value != item) {
			previous = current;
			current = current.next;
		}

		if (current != null) {
			if (previous == null) {
				first = current.next;
			}
			previous.next = current.next;
		}
	}

	public void reverse() {
		Node<T> aux = this.first;
		Node<T> current = this.first;
		while (current != null) {
			Node<T> innerAux = current;
			current = current.next;
			innerAux.next = aux;
			aux = innerAux;
		}
	}

	public int size() {
		if (this.first == null)
			return 0;

		Node<T> previous;
		Node<T> current = this.first;

		int size = 0;
		while (current != null) {
			previous = current;
			current = current.next;
			size++;
		}

		return size;
	}
	
}

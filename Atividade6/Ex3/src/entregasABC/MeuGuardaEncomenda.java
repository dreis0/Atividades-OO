package entregasABC;

import lista.*;

public class MeuGuardaEncomenda implements IGuardaEncomenda {

	ListaEncomenda encomendas = new ListaEncomenda();
	
	@Override
	public void adiciona(Encomenda e) {
		encomendas.add(e);
	}

	@Override
	public int getSize() {
		return encomendas.size();
	}

	@Override
	public void ordena() {	}
}

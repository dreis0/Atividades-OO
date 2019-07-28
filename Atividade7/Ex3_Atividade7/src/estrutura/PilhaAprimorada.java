package estrutura;

import excecoes.PilhaCheiaException;
import excecoes.PilhaVaziaException;

public class PilhaAprimorada extends PilhaSimples implements AutoCloseable {

	public PilhaAprimorada(int tamanhoMax) {
		super(tamanhoMax);
	}

	@Override
	public void empilha(Object novoItem) {
		if (super.getTopo() == super.getTamanhoMax() - 1)
			throw new PilhaCheiaException(super.getTamanhoMax(), novoItem);
		super.empilha(novoItem);
	}

	@Override
	public Object desempilha() {
		if (super.getTopo() == -1)
			throw new PilhaVaziaException();
		return super.desempilha();
	}

	@Override
	public void close() throws Exception {
		while (super.getTopo() >= 0)
			super.desempilha();
	}
}

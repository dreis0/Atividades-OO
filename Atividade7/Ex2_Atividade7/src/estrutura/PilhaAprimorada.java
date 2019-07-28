package estrutura;

import excecoes.PilhaCheiaException;
import excecoes.PilhaVaziaException;

public class PilhaAprimorada extends PilhaSimples {

	public PilhaAprimorada(int tamanhoMax) {
		super(tamanhoMax);
	}

	@Override
	public void empilha(Object novoItem) throws PilhaCheiaException {
		if (super.getTopo() == super.getTamanhoMax() - 1)
			throw new PilhaCheiaException(super.getTamanhoMax(), novoItem);
		super.empilha(novoItem);
	}

	@Override
	public Object desempilha() throws PilhaVaziaException {
		if (super.getTopo() == -1)
			throw new PilhaVaziaException();
		return super.desempilha();
	}
}

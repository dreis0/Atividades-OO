package entregasABC;

public interface IGuardaEncomenda {
	void adiciona(Encomenda e); // adiciona uma nova encomenda (não aceita
								// encomenda duplicada)

	int getSize(); // retorna o número de Encomendas (não nulas)

	void ordena(); // ordena as Encomendas (ponteiros para null vêm por último)
}
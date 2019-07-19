package entregasABC;

public interface IGuardaEncomenda {
	void adiciona(Encomenda e); // adiciona uma nova encomenda (n�o aceita
								// encomenda duplicada)

	int getSize(); // retorna o n�mero de Encomendas (n�o nulas)

	void ordena(); // ordena as Encomendas (ponteiros para null v�m por �ltimo)
}
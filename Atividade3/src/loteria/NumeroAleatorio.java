package loteria;

public class NumeroAleatorio {
	static int limite = 10;

	public static int getLimite() {
		return limite;
	}

	public static void setLimite(int limite) {
		NumeroAleatorio.limite = limite;
	}

	public static int getAleatorio() {
		return (int) (Math.random() * limite + 1);
	}
}

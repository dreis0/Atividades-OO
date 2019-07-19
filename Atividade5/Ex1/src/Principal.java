import funcionario.*;

public class Principal {

	public static void main(String[] args) {
		Funcionario[] funcionarioList = new Funcionario[5];

		for (int i = 0; i < funcionarioList.length; i++) {
			if (i % 2 == 0) {
				funcionarioList[i] = new Efetivo("Miguel " + i, "123.123.123-0" + i, "Setor " + i);
				funcionarioList[i].setSalario(1000 * (i + 1));
				funcionarioList[i].setTotalHoras(100 * (i + 1));
			}

			else {
				funcionarioList[i] = new Horista("Miguel " + i, "123.123.123-0" + i, "Setor " + i);
				funcionarioList[i].setSalario(100 * i);
				funcionarioList[i].setTotalHoras(100 * i);
			}

		}

		for (Funcionario f : funcionarioList) {
			System.out.println(f.toString());
			if (f.getClass() == Horista.class)
				System.out.println("Horista");
			else
				System.out.println("Efetivo");
			System.out.println();
		}

	}

}

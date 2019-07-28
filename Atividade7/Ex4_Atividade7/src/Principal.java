import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JOptionPane;

import arquivo.LeitorEscritorArquivo;
import excecoes.FuncionarioNaoCadastradoException;
import funcionario.Funcionario;

public class Principal {
	private static final int MAX = 100;
	private static String arquivo = "funcionarios.txt";
	private static Funcionario[] funcionarios = new Funcionario[MAX];
	private static LeitorEscritorArquivo leituraEscrita = new LeitorEscritorArquivo(arquivo);
	private static int indiceAtual = -1;

	public static void main(String[] args) {

		// carrega dados do arquivo para o vetor de funcionarios
		carregaDados(arquivo);

		int opcao = 0;
		do {
			try {

				opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n"
						+ "1. Cadastrar funcionário\n" + "2. Imprimir dados\n" + "3. Remover funcionário\n4. Sair"));
				switch (opcao) {
				case 1:
					cadastraFuncionario();
					break;
				case 2:
					imprimeDados();
					break;
				case 3:
					removeFuncionario(123);
					break;
				case 4:
					System.out.println("Fim!");
					break;

				default:
					System.out.println("Opção inválida!");
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("Entrada inválida");
			} catch (IOException ioEx) {
				System.out.println("Erro ao manipular arquivos");
			}
		} while (opcao != 4);

	}

	private static void carregaDados(String arquivo) {
		try {
			funcionarios = leituraEscrita.leDados();
		} catch (FileNotFoundException e) {
			System.out.println("Erro: Arquivo não encontrado! " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Erro durante a leitura do arquivo!" + e.getMessage());
		}
		// acerta o indiceAtual de acordo com o número de elementos no vetor
		for (int i = 0; i < MAX && funcionarios[i] != null; i++) {
			indiceAtual++;
		}
	}

	private static void imprimeDados() {
		int i = 0;
		System.out.println("------------------------");
		while (i <= indiceAtual && funcionarios[i] != null) {
			System.out.println(funcionarios[i].toString());
			System.out.println("------------------------");
			i++;
		}
	}

	private static void cadastraFuncionario() {
		if (indiceAtual + 1 < MAX) {
			int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do funcionário: "));
			String nome = JOptionPane.showInputDialog("Digite o nome: ");
			float salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário: "));

			Funcionario funcionario = new Funcionario(id, nome, salario);
			try {

				leituraEscrita.salva(funcionario);
				funcionarios[++indiceAtual] = funcionario;

			} catch (IOException e) {
				System.out.println("Erro no cadastro: " + e.getMessage());
			}
		} else {
			System.out.println("Limite atingido!");
		}
	}

	private static void removeFuncionario(int id) throws IOException {
		for (int i = 0; i < funcionarios.length; i++) {
			if (funcionarios[i].getId() == id) {
				leituraEscrita.remove(funcionarios[i]);
				for (int j = i; j < funcionarios.length - 2; j++) {
					funcionarios[j] = funcionarios[j + 1];
				}
				funcionarios[funcionarios.length - 1] = null;
				break;
			}
		}
	}

	private static int busca(int id) {
		for (int i = 0; i < funcionarios.length; i++) {
			if (funcionarios[i].getId() == id)
				return i;
		}
		throw new FuncionarioNaoCadastradoException();
	}

}

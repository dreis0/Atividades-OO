package copaamerica;

import java.util.jar.Attributes.Name;

public class Time {
	private Jogador[] equipe;

	public Time(Jogador[] pEquipe) {
		this.equipe = pEquipe;
		sort();
	}

	public boolean verificaTime() {
		if (equipe.length != 11)
			return false;

		int accGoleiros = 0;
		for (int i = 0; i < equipe.length; i++) {
			if (equipe[i].getPosicao() == "Goleiro")
				accGoleiros++;
		}

		return accGoleiros == 1;
	}

	public void substituicao(Jogador substituto, int numeroSub) {
		for (int i = 0; i < equipe.length; i++) {
			if (equipe[i].numero == numeroSub) {
				if (equipe[i].getPosicao() == "Goleiro" && substituto.getPosicao() != "Goleiro")
					return;
				equipe[i] = substituto;
			}
		}
	}

	@Override
	public String toString() {
		sort();
		StringBuilder builder = new StringBuilder();

		for (Jogador j : equipe) {
			builder.append(j.toString());
		}
		return builder.toString();
	}

	public void sort() {
		Jogador aux = equipe[0];
		int auxIdx = 0;

		for (int i = 0; i < equipe.length; i++) {
			aux = equipe[i];
			for (int j = i; j < equipe.length; j++) {
				if (equipe[j].numero <= aux.numero) {
					auxIdx = j;
					aux = equipe[j];
				}
			}
			equipe[auxIdx] = equipe[i];
			equipe[i] = aux;
		}
	}
}

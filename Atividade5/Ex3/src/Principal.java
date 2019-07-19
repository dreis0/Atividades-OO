import copaamerica.*;

public class Principal {

	public static void main(String[] args) {
		Jogador[] equipeABC = new Jogador[6];

		equipeABC[0] = new Atacante(9);
		equipeABC[1] = new Goleiro(1);
		equipeABC[2] = new Lateral(2, Lateral.Lado.Direito);
		equipeABC[3] = new Lateral(5, Lateral.Lado.Esquerdo);
		equipeABC[4] = new Atacante(11);
		equipeABC[5] = new Atacante(7);
		
		Time ABC = new Time(equipeABC);
		
		Jogador[] equipeDEF = new Jogador[6];

		equipeDEF[0] = new Atacante(9);
		equipeDEF[1] = new Goleiro(12);
		equipeDEF[2] = new Lateral(6, Lateral.Lado.Direito);
		equipeDEF[3] = new Lateral(5, Lateral.Lado.Esquerdo);
		equipeDEF[4] = new Atacante(11);
		equipeDEF[5] = new Atacante(13);
		
		Time DEF = new Time(equipeDEF);
		
		System.out.println("Time ABC: ");
		System.out.println(ABC.toString());
		
		System.out.println("Time DEF");
		System.out.println(DEF.toString());
		
		Jogador substitutoABC = new Atacante(10);
		ABC.substituicao(substitutoABC, 2);
		
		Jogador substitutoDEF = new Lateral(15, Lateral.Lado.Direito);
		DEF.substituicao(substitutoDEF, 12);
		
		System.out.println("Time ABC: ");
		System.out.println(ABC.toString());
		
		System.out.println("Time DEF");
		System.out.println(DEF.toString());
	}

}

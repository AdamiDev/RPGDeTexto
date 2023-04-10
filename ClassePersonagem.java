package rpgdetexto.main;
public class ClassePersonagem {
	private static Object classeEscolha;

	public static Object classeEscolhida() {
		return classeEscolha;
	}

	//Define a escolha de classe
	public static void obterClasse() {
		int obterClasse;
		System.out.println("Qual a sua classe?");
		System.out.println("1 - Guerreiro");
		System.out.println("2 - Caçador");
		System.out.println("3 - Assassino");
		obterClasse = ComandosLogico.leiaEscolha("\nEscolha uma opção:", 3);
		ComandosLogico.printGrafico(100);

		switch(obterClasse) {
		case 1:
			classeEscolha = new Guerreiro();
			break;

		case 2:
			classeEscolha = new Cacador();
			break;

		case 3:
			classeEscolha = new Assassino();
			break;

		default:
			System.out.println("Opção inválida!");
			break;
		}
	}
}

//Define o nome da classe
class Guerreiro {
	public String toString() {
		return "Guerreiro";
	}
}

class Cacador {
	public String toString() {
		return "Caçador";
	}
}

class Assassino {
	public String toString() {
		return "Assassino";
	}
}
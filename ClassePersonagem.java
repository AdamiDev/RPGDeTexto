package rpgdetexto.main;

public class ClassePersonagem {

	// Método para escolher a classe do personagem
	public static void obterClasse() {
		int obterClasse;
		System.out.println("Qual a sua classe?");
		System.out.println("1 - Guerreiro");
		System.out.println("2 - Arqueiro");
		System.out.println("3 - Assassino");
		System.out.println("4 - Mago");
		obterClasse = ComandosLogico.leiaEscolha("\nEscolha uma opção:", 4);
		ComandosLogico.printGrafico(100);

		switch(obterClasse) {
		case 1:
			Guerreiro guerreiro = new Guerreiro();
			System.out.println("Você escolheu o Guerreiro:\n");
			System.out.println("Força: " + guerreiro.forcaGuerreiro);
			System.out.println("Agilidade: " + guerreiro.agilidadeGuerreiro);
			System.out.println("Precisão: " + guerreiro.precisaoGuerreiro);
			System.out.println("Resistência: " + guerreiro.resistenciaGuerreiro);
			ComandosLogico.pararJogo();
			break;

		case 2:
			Arqueiro arqueiro = new Arqueiro();
			System.out.println("Você escolheu o Arqueiro:\n");
			System.out.println("Força: " + arqueiro.forcaArqueiro);
			System.out.println("Agilidade: " + arqueiro.agilidadeArqueiro);
			System.out.println("Precisão: " + arqueiro.precisaoArqueiro);
			System.out.println("Resistência: " + arqueiro.resistenciaArqueiro);
			ComandosLogico.pararJogo();
			break;

		case 3:
			Assassino assassino = new Assassino();
			System.out.println("Você escolheu o Assassino:\n");
			System.out.println("Força: " + assassino.forcaAssassino);
			System.out.println("Agilidade: " + assassino.agilidadeAssassino);
			System.out.println("Precisão: " + assassino.precisaoAssassino);
			System.out.println("Resistência: " + assassino.resistenciaAssassino);
			ComandosLogico.pararJogo();
			break;

		case 4:
			Mago mago = new Mago();
			System.out.println("Você escolheu o Mago:\n");
			System.out.println("Força: " + mago.magiaMago);
			System.out.println("Agilidade: " + mago.agilidadeMago);
			System.out.println("Precisão: " + mago.precisaoMago);
			System.out.println("Resistência: " + mago.resistenciaMago);
			ComandosLogico.pararJogo();
			break;

		default:
			System.out.println("Opção inválida!");
			break;
		}
	}

}

//Define os atributos da classe
class Guerreiro {
	int forcaGuerreiro = 5, agilidadeGuerreiro = 2, precisaoGuerreiro = 2, resistenciaGuerreiro = 4;
}

class Arqueiro {
	int forcaArqueiro = 3, agilidadeArqueiro = 3, precisaoArqueiro = 4, resistenciaArqueiro = 2;
}

class Assassino {
	int forcaAssassino = 3, agilidadeAssassino = 4, precisaoAssassino = 3, resistenciaAssassino = 2;
}

class Mago {
	int magiaMago = 2, agilidadeMago = 2, precisaoMago = 5, resistenciaMago = 1;
}
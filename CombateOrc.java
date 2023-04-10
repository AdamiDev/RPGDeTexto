package rpgdetexto.main;

public class CombateOrc {
	static int vidaJogador, vidaInimigo, danoAtaque, curaItem, fuga;

	//Define os atributos do personagem e do inimigo
	public static void iniciar() {
		vidaJogador = 800;
		vidaInimigo = 800;
		danoAtaque = 100;
		curaItem = 50;
		fuga = 0;

		//Define as escolhas do usuário no combate
		while (true) {
			ComandosLogico.limparConsole();
			ComandosLogico.printTitulo(" _____            _____ _                   _       \r\n"
					+ "|  _  |          |  __ (_)                 | |      \r\n"
					+ "| | | |_ __ ___  | |  \\/_  __ _  __ _ _ __ | |_ ___ \r\n"
					+ "| | | | '__/ __| | | __| |/ _` |/ _` | '_ \\| __/ _ \\\r\n"
					+ "\\ \\_/ / | | (__  | |_\\ \\ | (_| | (_| | | | | ||  __/\r\n"
					+ " \\___/|_|  \\___|  \\____/_|\\__, |\\__,_|_| |_|\\__\\___|\r\n"
					+ "                           __/ |                    \r\n"
					+ "                          |___/                     ");
			exibirStatus();
			System.out.println("O que você deseja fazer?");
			System.out.println("1 - Atacar");
			System.out.println("2 - Usar item de cura");
			System.out.println("3 - Tentar fugir");
			int escolha = ComandosLogico.leiaEscolha("\nEscolha uma opção:", 3);

			switch (escolha) {
			case 1:
				atacar();
				break;
			case 2:
				usarItem();
				break;
			case 3:
				tentarFugir();
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}

			//Mensagem de vitória ou derrota
			if (vidaInimigo <= 0) {
				ComandosLogico.limparConsole();
				System.out.println("Você venceu a batalha!");
				ComandosLogico.pararJogo();
				break;
			} else if (vidaJogador <= 0) {
				ComandosLogico.limparConsole();
				System.out.println("Você foi derrotado!");
				ComandosLogico.pararJogo();
				MenuDoJogo.iniciar();
				break;
			}
		}

	}

	//Define a opçao de status
	public static void exibirStatus() {
		ComandosLogico.printGrafico(100);
		System.out.println("Orc: " + vidaInimigo + " de vida.");
		System.out.println(Jogador.nomeJogador + ": " + vidaJogador + " de vida.");
		ComandosLogico.printGrafico(100);
		ComandosLogico.printGrafico(100);
	}

	//Define a opçao de ataque
	public static void atacar() {
		int dano = (int)(Math.random() * danoAtaque) + 20;
		ComandosLogico.limparConsole();
		ComandosLogico.printGrafico(100);
		System.out.println("Você ataca o inimigo e causa " + dano + " de dano!");
		vidaInimigo -= dano;
		ataqueInimigo();
		ComandosLogico.printGrafico(100);
		ComandosLogico.pararJogo();
	}

	//Define a opçao de usar item
	public static void usarItem() {
		int cura = (int)(Math.random() * curaItem) +20;
		ComandosLogico.limparConsole();
		ComandosLogico.printGrafico(100);
		System.out.println("Você usa um item de cura e recupera " + cura + " de vida!");
		vidaJogador += cura;
		ataqueInimigo();
		ComandosLogico.printGrafico(100);
		ComandosLogico.pararJogo();
	}

	//Define a opçao de fugir
	public static void tentarFugir() {
		int chanceFuga = (int)(Math.random() * 100);
		if (chanceFuga <= fuga) {
			ComandosLogico.limparConsole();
			ComandosLogico.printGrafico(100);
			System.out.println("Você conseguiu fugir!");
			ComandosLogico.printGrafico(100);
			ComandosLogico.pararJogo();
			System.exit(0);
		} else {
			ComandosLogico.limparConsole();
			ComandosLogico.printGrafico(100);
			System.out.println("Você não conseguiu fugir!");
			ataqueInimigo();
			ComandosLogico.printGrafico(100);
			ComandosLogico.pararJogo();
		}
	}

	//Define a opçao de ataque do inimigo
	public static void ataqueInimigo() {
		int dano = (int)(Math.random() * danoAtaque) + 5;
		System.out.println("O inimigo ataca e causa " + dano + " de dano!");
		vidaJogador -= dano;
	}

}

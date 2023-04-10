package rpgdetexto.main;

import java.util.Scanner;

public class MenuDoJogo {
	static Scanner scanner = new Scanner(System.in);
	
	public static void iniciar() {
		int menuJogo;

		do {
			ComandosLogico.limparConsole();
			ComandosLogico.printTitulo("\n   ___                                         _____\r\n"
					+ "  |_  |                            ___        |  _  \\\r\n"
					+ "    | |  __ _ __   __  __ _       ( _ )       | | | | _   _  _ __    __ _   ___   ___   _ __   ___\r\n"
					+ "    | | / _` |\\ \\ / / / _` |      / _ \\/\\     | | | || | | || '_ \\  / _` | / _ \\ / _ \\ | '_ \\ / __|\r\n"
					+ "/\\__/ /| (_| | \\ V / | (_| |     | (_>  <     | |/ / | |_| || | | || (_| ||  __/| (_) || | | |\\__ \\\r\n"
					+ "\\____/  \\__,_|  \\_/   \\__,_|      \\___/\\/     |___/   \\__,_||_| |_| \\__, | \\___| \\___/ |_| |_||___/\r\n"
					+ "                                                                    __/ |\r\n"
					+ "                                                                   |___/\r\n"
					+ "");
			System.out.println("1 - Começar novo jogo");
			System.out.println("2 - Opções");
			System.out.println("3 - Créditos");
			System.out.println("4 - Sair");
			ComandosLogico.printGrafico(100);
			menuJogo = ComandosLogico.leiaEscolha("\nEscolha uma opção:", 4);

			switch(menuJogo) {
			case 1:
				//Iniciar novo jogo
				ComandosLogico.limparConsole();
		    	ComandosLogico.printTitulo(" _____      _                             _                                                                   \r\n"
		    			+ "/  __ \\    (_)                           | |                                                                  \r\n"
		    			+ "| /  \\/_ __ _  __ _  ___ __ _  ___     __| | ___   _ __   ___ _ __ ___  ___  _ __   __ _  __ _  ___ _ __ ___  \r\n"
		    			+ "| |   | '__| |/ _` |/ __/ _` |/ _ \\   / _` |/ _ \\ | '_ \\ / _ \\ '__/ __|/ _ \\| '_ \\ / _` |/ _` |/ _ \\ '_ ` _ \\ \r\n"
		    			+ "| \\__/\\ |  | | (_| | (_| (_| | (_) | | (_| |  __/ | |_) |  __/ |  \\__ \\ (_) | | | | (_| | (_| |  __/ | | | | |\r\n"
		    			+ " \\____/_|  |_|\\__,_|\\___\\__,_|\\___/   \\__,_|\\___| | .__/ \\___|_|  |___/\\___/|_| |_|\\__,_|\\__, |\\___|_| |_| |_|\r\n"
		    			+ "                                                  | |                                     __/ |               \r\n"
		    			+ "                                                  |_|                                    |___/                ");
				Jogador.obterNome();
				ComandosLogico.printGrafico(100);
				ClassePersonagem.obterClasse();
				Historia.introducao();
				break;

			case 2:
				//Opções
				ComandosLogico.limparConsole();
				ComandosLogico.printTitulo(" _____\r\n"
						+ "|  _  |                                _\r\n"
						+ "| | | | _ __    ___   ___    ___  ___ (_)\r\n"
						+ "| | | || '_ \\  / __| / _ \\  / _ \\/ __|\r\n"
						+ "\\ \\_/ /| |_) || (__ | (_) ||  __/\\__ \\ _\r\n"
						+ " \\___/ | .__/  \\___| \\___/  \\___||___/(_)\r\n"
						+ "       | |\r\n"
						+ "       |_|\n");
				System.out.println("Não há opções disponíveis");
				ComandosLogico.printGrafico(100);
				ComandosLogico.pararJogo();
				break;

			case 3:
				//Créditos
				ComandosLogico.limparConsole();
				ComandosLogico.printTitulo(" _____                  _  _  _\r\n"
						+ "/  __ \\                | |(_)| |               _\r\n"
						+ "| /  \\/ _ __   ___   __| | _ | |_   ___   ___ (_)\r\n"
						+ "| |    | '__| / _ \\ / _` || || __| / _ \\ / __|\r\n"
						+ "| \\__/\\| |   |  __/| (_| || || |_ | (_) |\\__ \\ _\r\n"
						+ " \\____/|_|    \\___| \\__,_||_| \\__| \\___/ |___/(_)\r\n"
						+ "");
				System.out.println("Desenvolvimento:");
				System.out.println("Rafael Adami - Responsável pela criação dos códigos e estrutura em Java.");
				System.out.println("Igor Carvalho - Colaborador no desenvolvimento de códigos em Java, ajudando a garantir a qualidade do software.\n");
				System.out.println("História:");
				System.out.println("Lucas Rodrigues - Responsável por criar a narrativa cativante do jogo e os caminhos variados para o jogador explorar.\n");
				System.out.println("Interface Gráfica:");
				System.out.println("Lucas Silveira - Designer de interface gráfica, criador da interface ASCII do jogo que dá vida ao mundo virtual.\n");
				ComandosLogico.printGrafico(100);
				ComandosLogico.pararJogo();
				break;

			case 4:
				//Sair
				ComandosLogico.limparConsole();
				System.out.println("Obrigado por jogar Java & Dungeons!");
				break;

			default:
				//Opção inválida
				System.out.println("Opção inválida!");
				ComandosLogico.pararJogo();
				break;
			}

		}while(menuJogo != 4);
	}

}
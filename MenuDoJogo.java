package rpgdetexto.main;

public class MenuDoJogo {

	public static void iniciar(int menuJogo){

		do {
			ComandosLogico.limparConsole();
			ComandosLogico.printTitulo("Java & Dungeons");
			System.out.println("1 - Começar novo jogo");
			System.out.println("2 - Carregar jogo salvo");
			System.out.println("3 - Opções");
			System.out.println("4 - Créditos");
			System.out.println("5 - Sair");
			ComandosLogico.printGrafico(30);
			menuJogo = ComandosLogico.leiaEscolha("\nEscolha uma opção:", 5);

			switch(menuJogo){
			case 1:
				//Iniciar novo jogo
				ComandosLogico.limparConsole();
				System.out.println("Iniciando novo jogo...");
				ComandosLogico.pararJogo();
				break;

			case 2:
				//Carregar jogo salvo
				ComandosLogico.limparConsole();
				System.out.println("Carregando jogo salvo...");
				ComandosLogico.pararJogo();
				break;

			case 3:
				//Opções
				ComandosLogico.limparConsole();
				ComandosLogico.printTitulo("Opções:");
				System.out.println("Não há opções disponíveis.");
				ComandosLogico.printGrafico(30);
				ComandosLogico.pararJogo();
				break;

			case 4:
				//Créditos
				ComandosLogico.limparConsole();
				ComandosLogico.printTitulo("Créditos:");
				System.out.println("Desenvolvido por:");
				System.out.println("\nRafael Adami \nLucas Rodrigues \nIgor Carvalho \nLucas Silveira");
				ComandosLogico.printGrafico(30);
				ComandosLogico.pararJogo();
				break;

			case 5:
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

		}while(menuJogo != 5);
	}

}
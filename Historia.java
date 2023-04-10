package rpgdetexto.main;

public class Historia {

	//Define a introdução da história
	public static void introducao() {
		ComandosLogico.limparConsole();
		ComandosLogico.printTitulo(" _____ _             _    _____                   \r\n"
				+ "/  ___(_)           | |  |_   _|                  \r\n"
				+ "\\ `--. _ _ __   __ _| | ___| | _____      ___ __  \r\n"
				+ " `--. \\ | '_ \\ / _` | |/ _ \\ |/ _ \\ \\ /\\ / / '_ \\ \r\n"
				+ "/\\__/ / | | | | (_| | |  __/ | (_) \\ V  V /| | | |\r\n"
				+ "\\____/|_|_| |_|\\__, |_|\\___\\_/\\___/ \\_/\\_/ |_| |_|\r\n"
				+ "                __/ |                             \r\n"
				+ "               |___/                              ");
		System.out.print("Você é " + Jogador.nomeJogador + ", um " + ClassePersonagem.classeEscolhida() + " treinado e pronto para mostrar suas habilidades em batalha."
				+ "\nApós uma longa viagem que teve início nos reinos do norte, você chega a Singletown."
				+ "\nSingletown é uma cidade tranquila e acolhedora, localizada em um vale cercado por florestas."	
				+ "\nVocê estava cansado, com fome e com sede, mas ainda assim animado por estar chegando a um lugar novo."
				+ "\nAo se aproximar da cidade, você percebe um fluxo intenso de pessoas saindo às pressas."
				+ "\nIntrigado, você corre para um dos cidadãos e pergunta o que está acontecendo.\n");
		ComandosLogico.pararJogo();

		ComandosLogico.limparConsole();
		ComandosLogico.printTitulo(" _____ _             _    _____                   \r\n"
				+ "/  ___(_)           | |  |_   _|                  \r\n"
				+ "\\ `--. _ _ __   __ _| | ___| | _____      ___ __  \r\n"
				+ " `--. \\ | '_ \\ / _` | |/ _ \\ |/ _ \\ \\ /\\ / / '_ \\ \r\n"
				+ "/\\__/ / | | | | (_| | |  __/ | (_) \\ V  V /| | | |\r\n"
				+ "\\____/|_|_| |_|\\__, |_|\\___\\_/\\___/ \\_/\\_/ |_| |_|\r\n"
				+ "                __/ |                             \r\n"
				+ "               |___/                              ");
		System.out.print(Jogador.nomeJogador + ": Olá, o que está acontecendo aqui? Por que todos parecem estar em pânico?"
				+ "\nAldeão: Estamos sendo atacados por um elemental de pedra."
				+ "\nEle está causando estragos na aldeia e colocando nossas vidas em perigo."
				+ "\n" + Jogador.nomeJogador + ": Um elemental de pedra? Isso parece ser uma situação complicada."
				+ "\nEu sou um " + ClassePersonagem.classeEscolhida() + " treinado, o que posso fazer para ajudar?"
				+ "\nAldeão: Você pode nos ajudar a fugir para a floresta, ou pode tentar combater o monstro."
				+ "\n" + Jogador.nomeJogador + ": Hmm, essa é uma decisão difícil. não sei se posso combater um elemental de pedra.\n");
		ComandosLogico.pararJogo();

		ComandosLogico.limparConsole();
		rotasHistoria();
	}

	//Define uma escolha de rota para definir a história
	public static void rotasHistoria() {
		ComandosLogico.printTitulo(" _____ _             _    _____                   \r\n"
				+ "/  ___(_)           | |  |_   _|                  \r\n"
				+ "\\ `--. _ _ __   __ _| | ___| | _____      ___ __  \r\n"
				+ " `--. \\ | '_ \\ / _` | |/ _ \\ |/ _ \\ \\ /\\ / / '_ \\ \r\n"
				+ "/\\__/ / | | | | (_| | |  __/ | (_) \\ V  V /| | | |\r\n"
				+ "\\____/|_|_| |_|\\__, |_|\\___\\_/\\___/ \\_/\\_/ |_| |_|\r\n"
				+ "                __/ |                             \r\n"
				+ "               |___/                              ");
		System.out.println("Qual caminho você decide seguir?");
		System.out.println("1 - Entrar na cidade");
		System.out.println("2 - Fugir para a floresta");
		int rotasHistoria = ComandosLogico.leiaEscolha("\nEscolha uma opção:", 2);
		ComandosLogico.printGrafico(100);

		switch(rotasHistoria) {
		case 1:
			rotaCidade();
			break;

		case 2:
			rotaFloresta();
			break;

		default:
			System.out.println("Opção inválida!");
			break;
		}
	}

	//Caminho caso escolha entrar na cidade
	public static void rotaCidade() {
		ComandosLogico.limparConsole();
		ComandosLogico.printTitulo(" _____ _             _    _____                   \r\n"
				+ "/  ___(_)           | |  |_   _|                  \r\n"
				+ "\\ `--. _ _ __   __ _| | ___| | _____      ___ __  \r\n"
				+ " `--. \\ | '_ \\ / _` | |/ _ \\ |/ _ \\ \\ /\\ / / '_ \\ \r\n"
				+ "/\\__/ / | | | | (_| | |  __/ | (_) \\ V  V /| | | |\r\n"
				+ "\\____/|_|_| |_|\\__, |_|\\___\\_/\\___/ \\_/\\_/ |_| |_|\r\n"
				+ "                __/ |                             \r\n"
				+ "               |___/                              ");
		System.out.print("Decidido à derrotar o monstro, você segue em direção à cidade, se deparando com um cenário caótico."
				+ "\nVocê vê o monstro atacando as construções da cidade, e decide avançar até ele."
				+ "\nEle tem uma estatura de cerca de 2 metros, mas isso não te intimida e você parte para o ataque.\n");
		ComandosLogico.pararJogo();

		//Inicia sistema de combate
		CombateElemental.iniciar();

		ComandosLogico.limparConsole();
		ComandosLogico.printTitulo(" _____ _             _    _____                   \r\n"
				+ "/  ___(_)           | |  |_   _|                  \r\n"
				+ "\\ `--. _ _ __   __ _| | ___| | _____      ___ __  \r\n"
				+ " `--. \\ | '_ \\ / _` | |/ _ \\ |/ _ \\ \\ /\\ / / '_ \\ \r\n"
				+ "/\\__/ / | | | | (_| | |  __/ | (_) \\ V  V /| | | |\r\n"
				+ "\\____/|_|_| |_|\\__, |_|\\___\\_/\\___/ \\_/\\_/ |_| |_|\r\n"
				+ "                __/ |                             \r\n"
				+ "               |___/                              ");
		System.out.print("Todos ficam felizes com a derrota do monstro."
				+ "\nOs aldeões retornam para a cidade e vão em sua direção para lhe agradecer."
				+ "\nUm idoso se aproxima de você para agradecer.\n");
		ComandosLogico.pararJogo();

		ComandosLogico.limparConsole();
		ComandosLogico.printTitulo(" _____ _             _    _____                   \r\n"
				+ "/  ___(_)           | |  |_   _|                  \r\n"
				+ "\\ `--. _ _ __   __ _| | ___| | _____      ___ __  \r\n"
				+ " `--. \\ | '_ \\ / _` | |/ _ \\ |/ _ \\ \\ /\\ / / '_ \\ \r\n"
				+ "/\\__/ / | | | | (_| | |  __/ | (_) \\ V  V /| | | |\r\n"
				+ "\\____/|_|_| |_|\\__, |_|\\___\\_/\\___/ \\_/\\_/ |_| |_|\r\n"
				+ "                __/ |                             \r\n"
				+ "               |___/                              ");
		System.out.print("Idoso: Obrigado por nos salvar, por salvar nossa vila."
				+ "\nNo entanto, não é o primeiro ataque, então essa vitória não será eterna."
				+ "\n" + Jogador.nomeJogador + ": Como assim? Quais outros ataques ocorreram?"
				+ "\nIdoso: Tudo se iniciou há cerca de 2 semanas, estamos sendo atacados por dias alternados."
				+ "\nMuitos Acredita-se que exista algum lugar no interior da floresta que esteja expulsando esses monstros."
				+ "\n" + Jogador.nomeJogador + ": Obrigado pelas informações, darei um fim a esses monstros.\n");
		ComandosLogico.pararJogo();

		ComandosLogico.limparConsole();
		ComandosLogico.printTitulo("______ _                     _        \r\n"
				+ "|  ___| |                   | |       \r\n"
				+ "| |_  | | ___  _ __ ___  ___| |_ __ _ \r\n"
				+ "|  _| | |/ _ \\| '__/ _ \\/ __| __/ _` |\r\n"
				+ "| |   | | (_) | | |  __/\\__ \\ || (_| |\r\n"
				+ "\\_|   |_|\\___/|_|  \\___||___/\\__\\__,_|\r\n"
				+ "                                      \r\n"
				+ "                                      ");
		System.out.print("Então, você parte em busca dessas criaturas no interior da floresta."
				+ "\nApós caminhar meia hora, percebe um lobo se locomovendo com dificuldade, que cai sem vida."
				+ "\nChegando perto, você vê uma ferida em sua cabeça."
				+ "\nVocê suspeita fortemente que o causador da morte seja o responsável pelas tragédias."
				+ "\nAssim, você segue o rastro de sangue.\n");
		ComandosLogico.pararJogo();

		ComandosLogico.limparConsole();
		ComandosLogico.printTitulo("______ _                     _        \r\n"
				+ "|  ___| |                   | |       \r\n"
				+ "| |_  | | ___  _ __ ___  ___| |_ __ _ \r\n"
				+ "|  _| | |/ _ \\| '__/ _ \\/ __| __/ _` |\r\n"
				+ "| |   | | (_) | | |  __/\\__ \\ || (_| |\r\n"
				+ "\\_|   |_|\\___/|_|  \\___||___/\\__\\__,_|\r\n"
				+ "                                      \r\n"
				+ "                                      ");
		System.out.print("Após caminhar cerca de 20 metros pra sudeste o rastro acaba e não há mais nada."
				+ "\nPorem, pouco tempo depois você ouve um rugido que estremeceu a floresta."
				+ "\nEntão você decide ir em direção ao barulho, quando derrepente."
				+ "\nUm urso aparece do nada e parte para te atacar.\n");
		ComandosLogico.pararJogo();

		//Inicia sistema de combate
		CombateUrso.iniciar();

		ComandosLogico.limparConsole();
		ComandosLogico.printTitulo("______ _                     _        \r\n"
				+ "|  ___| |                   | |       \r\n"
				+ "| |_  | | ___  _ __ ___  ___| |_ __ _ \r\n"
				+ "|  _| | |/ _ \\| '__/ _ \\/ __| __/ _` |\r\n"
				+ "| |   | | (_) | | |  __/\\__ \\ || (_| |\r\n"
				+ "\\_|   |_|\\___/|_|  \\___||___/\\__\\__,_|\r\n"
				+ "                                      \r\n"
				+ "                                      ");
		System.out.print("Logo após derrotar o urso, você escuta passos que chegam a tremer o chão."
				+ "\nVocê decide se esconder em um arbusto para ver quem é o responsável pelo rugido."
				+ "\nAssim que você se posicionou no arbusto, uma árvore um pouco a sua frente caí no chão.\n");
		ComandosLogico.pararJogo();

		ComandosLogico.limparConsole();
		ComandosLogico.printTitulo("______ _                     _        \r\n"
				+ "|  ___| |                   | |       \r\n"
				+ "| |_  | | ___  _ __ ___  ___| |_ __ _ \r\n"
				+ "|  _| | |/ _ \\| '__/ _ \\/ __| __/ _` |\r\n"
				+ "| |   | | (_) | | |  __/\\__ \\ || (_| |\r\n"
				+ "\\_|   |_|\\___/|_|  \\___||___/\\__\\__,_|\r\n"
				+ "                                      \r\n"
				+ "                                      ");
		System.out.print("Logo em seguida aparece um ORC de 4 metros de altura e com uma clava enorme em sua mão."
				+ "\nO ORC o fareja e caminha em sua direção."
				+ "\nEntão você fica em posição de combate, determinado a acabar com ele, e salvar a cidade.\n");
		ComandosLogico.pararJogo();

		//Inicia sistema de combate
		CombateOrc.iniciar();

		ComandosLogico.limparConsole();
		ComandosLogico.printTitulo("______ _                     _        \r\n"
				+ "|  ___| |                   | |       \r\n"
				+ "| |_  | | ___  _ __ ___  ___| |_ __ _ \r\n"
				+ "|  _| | |/ _ \\| '__/ _ \\/ __| __/ _` |\r\n"
				+ "| |   | | (_) | | |  __/\\__ \\ || (_| |\r\n"
				+ "\\_|   |_|\\___/|_|  \\___||___/\\__\\__,_|\r\n"
				+ "                                      \r\n"
				+ "                                      ");
		System.out.print("Após horas de batalha, você sai vitorioso."
				+ "\nEntão você parte em direção a cidade."
				+ "\nAo chegar, você é recebido calorosamente por todos os cidadãos."
				+ "\nAssim que as gratificações acabaram, e mesmo sendo ofertada a sua morada na cidade."
				+ "\nVocê decide seguir a sua jornada de caça aos monstros."
				+ "\nPor esse e outros feitos, o guerreiro foi reconhecido pelo reino inteiro."
				+ "\nBoatos que até nos dias atuais ele combate bravamente o mal.\n");
		ComandosLogico.pararJogo();

		//Fim de jogo
		ComandosLogico.limparConsole();
		System.out.print("______ _                 _          _                     _ \r\n"
				+ "|  ___(_)               | |        (_)                   | |\r\n"
				+ "| |_   _ _ __ ___     __| | ___     _  ___   __ _  ___   | |\r\n"
				+ "|  _| | | '_ ` _ \\   / _` |/ _ \\   | |/ _ \\ / _` |/ _ \\  | |\r\n"
				+ "| |   | | | | | | | | (_| |  __/   | | (_) | (_| | (_) | |_|\r\n"
				+ "\\_|   |_|_| |_| |_|  \\__,_|\\___|   | |\\___/ \\__, |\\___/  (_)\r\n"
				+ "                                  _/ |       __/ |          \r\n"
				+ "                                 |__/       |___/           \n\n");
		ComandosLogico.pararJogo();
	}

	//Caminho caso escolha fugir para a floresta
	public static void rotaFloresta() {
		ComandosLogico.limparConsole();
		ComandosLogico.printTitulo(" _____ _             _    _____                   \r\n"
				+ "/  ___(_)           | |  |_   _|                  \r\n"
				+ "\\ `--. _ _ __   __ _| | ___| | _____      ___ __  \r\n"
				+ " `--. \\ | '_ \\ / _` | |/ _ \\ |/ _ \\ \\ /\\ / / '_ \\ \r\n"
				+ "/\\__/ / | | | | (_| | |  __/ | (_) \\ V  V /| | | |\r\n"
				+ "\\____/|_|_| |_|\\__, |_|\\___\\_/\\___/ \\_/\\_/ |_| |_|\r\n"
				+ "                __/ |                             \r\n"
				+ "               |___/                              ");
		System.out.print("Você percebendo que a situação poderia estar além das suas capacidades se abriga na Floresta."
				+ "\nApós longas 4 horas o elemental de Pedra foi embora, no entanto não restou nada da vila."
				+ "\nOs moradores que sobreviveram voltavam aos poucos para a Vila."
				+ "\nTodos estavam desamparados pois já não haviam mais lar, tudo foi destruído."
				+ "\nVocê percebe que poderia ter contornado essa situação caso tivesse combatido o elemental."
				+ "\nEnvergonhado retira-se do local pela estrada de onde veio.\n");
		ComandosLogico.pararJogo();

		ComandosLogico.limparConsole();
		ComandosLogico.printTitulo("______                                  \r\n"
				+ "| ___ \\                                 \r\n"
				+ "| |_/ /_ __ _   _  __ _ _   _  ___  ___ \r\n"
				+ "| ___ \\ '__| | | |/ _` | | | |/ _ \\/ __|\r\n"
				+ "| |_/ / |  | |_| | (_| | |_| |  __/\\__ \\\r\n"
				+ "\\____/|_|   \\__,_|\\__, |\\__,_|\\___||___/\r\n"
				+ "                   __/ |                \r\n"
				+ "                  |___/                 ");
		System.out.print("Após um dia de viagem a pé você chega em uma Vila vizinha um pouco maior que Singletown."
				+ "\nEsta por sua vez se chamava Bruges."
				+ "\nVocê decide então descansar da sua viagem em uma pousada local."
				+ "\nAo andar pela cidade percebe que muitos moradores estão aflitos."
				+ "\nEntão, você decide perguntar à um comerciante o que está acontecendo.\n");
		ComandosLogico.pararJogo();

		ComandosLogico.limparConsole();
		ComandosLogico.printTitulo("______                                  \r\n"
				+ "| ___ \\                                 \r\n"
				+ "| |_/ /_ __ _   _  __ _ _   _  ___  ___ \r\n"
				+ "| ___ \\ '__| | | |/ _` | | | |/ _ \\/ __|\r\n"
				+ "| |_/ / |  | |_| | (_| | |_| |  __/\\__ \\\r\n"
				+ "\\____/|_|   \\__,_|\\__, |\\__,_|\\___||___/\r\n"
				+ "                   __/ |                \r\n"
				+ "                  |___/                 ");
		System.out.print(Jogador.nomeJogador + ": Oque está acontecendo aqui, porque todos os cidadãos parecem estar aflitos?"	
				+ "\nComerciante: fico surpreso que não saiba o motivo do medo dos cidadãos. "
				+ "\nTodas as vilas próximas estão sendo atacadas constantemente por monstros."
				+ "\nÉ Questão de Tempo até que a nossa seja o próximo alvo.\n");
		ComandosLogico.pararJogo();

		ComandosLogico.limparConsole();
		ComandosLogico.printTitulo("______                                  \r\n"
				+ "| ___ \\                                 \r\n"
				+ "| |_/ /_ __ _   _  __ _ _   _  ___  ___ \r\n"
				+ "| ___ \\ '__| | | |/ _` | | | |/ _ \\/ __|\r\n"
				+ "| |_/ / |  | |_| | (_| | |_| |  __/\\__ \\\r\n"
				+ "\\____/|_|   \\__,_|\\__, |\\__,_|\\___||___/\r\n"
				+ "                   __/ |                \r\n"
				+ "                  |___/                 ");
		System.out.print("Você reflete sobre o ataque de singletown e sente uma culpa enorme."
				+ "\nDecidido a limpar a sua consciência e trazer paz as vilas próximas você decide eliminar os monstros!"
				+ "\nEntão você parte para reunir informações com os moradores."
				+ "\nA maioria dos moradores não sabia praticamente nada dos ataques."
				+ "\nPorem, você encontra uma aldeã refugiada de singletown e lhe questiona a respeito do ataque.\n");
		ComandosLogico.pararJogo();

		ComandosLogico.limparConsole();
		ComandosLogico.printTitulo("______                                  \r\n"
				+ "| ___ \\                                 \r\n"
				+ "| |_/ /_ __ _   _  __ _ _   _  ___  ___ \r\n"
				+ "| ___ \\ '__| | | |/ _` | | | |/ _ \\/ __|\r\n"
				+ "| |_/ / |  | |_| | (_| | |_| |  __/\\__ \\\r\n"
				+ "\\____/|_|   \\__,_|\\__, |\\__,_|\\___||___/\r\n"
				+ "                   __/ |                \r\n"
				+ "                  |___/                 ");
		System.out.print(Jogador.nomeJogador + ": Ei, sei que é um assunto delicado, mas poderia me falar alguns detalhes?"
				+ "\nAlguma informação preciosa a respeito dos ataques de monstros?"
				+ "\nAldeã: só de me lembrar do que aconteceu os sentimentos ruins retornam."
				+ "\nMas se servir de algo posso te dar algumas informações.\n");
				ComandosLogico.pararJogo();
				
				ComandosLogico.limparConsole();
				ComandosLogico.printTitulo("______                                  \r\n"
						+ "| ___ \\                                 \r\n"
						+ "| |_/ /_ __ _   _  __ _ _   _  ___  ___ \r\n"
						+ "| ___ \\ '__| | | |/ _` | | | |/ _ \\/ __|\r\n"
						+ "| |_/ / |  | |_| | (_| | |_| |  __/\\__ \\\r\n"
						+ "\\____/|_|   \\__,_|\\__, |\\__,_|\\___||___/\r\n"
						+ "                   __/ |                \r\n"
						+ "                  |___/                 ");
				System.out.print("Aldeã: Antes do ataque do elemental nossa Vila já havia sofrendo ataques durante 2 semanas."
				+ "\nSão sempre monstros variados desde lobos, goblins e ursos."
				+ "\nTodos suspeitavam que havia algum monstro muito poderoso no interior da Floresta."
				+ "\nE que ele estava afugentando os monstros que residiam nela."
				+ "\nEssa teoria ficou mais forte depois de ouvirmos rugidos e passos.");
				ComandosLogico.pararJogo();
				
				ComandosLogico.limparConsole();
				ComandosLogico.printTitulo("______                                  \r\n"
						+ "| ___ \\                                 \r\n"
						+ "| |_/ /_ __ _   _  __ _ _   _  ___  ___ \r\n"
						+ "| ___ \\ '__| | | |/ _` | | | |/ _ \\/ __|\r\n"
						+ "| |_/ / |  | |_| | (_| | |_| |  __/\\__ \\\r\n"
						+ "\\____/|_|   \\__,_|\\__, |\\__,_|\\___||___/\r\n"
						+ "                   __/ |                \r\n"
						+ "                  |___/                 ");
				System.out.print(Jogador.nomeJogador + ": Agradeço profundamente, o seu sofrimento não será em vão."
				+ "\nVou partir em uma missão para destruir o monstro responsável por esse alvoroço."
				+ "\nAldeã: Não faça isso é perigoso e praticamente impossível derrotar uma criatura de tamanho poder."
				+ "\n" + Jogador.nomeJogador + ": Pode não parecer, mas eu sou um " + ClassePersonagem.classeEscolhida() + " treinado."
				+ "\nAlém disso estou determinado a derrota-lo não há nada que possa me impedir.\n");
		ComandosLogico.pararJogo();

		ComandosLogico.limparConsole();
		ComandosLogico.printTitulo("______ _                     _        \r\n"
				+ "|  ___| |                   | |       \r\n"
				+ "| |_  | | ___  _ __ ___  ___| |_ __ _ \r\n"
				+ "|  _| | |/ _ \\| '__/ _ \\/ __| __/ _` |\r\n"
				+ "| |   | | (_) | | |  __/\\__ \\ || (_| |\r\n"
				+ "\\_|   |_|\\___/|_|  \\___||___/\\__\\__,_|\r\n"
				+ "                                      \r\n"
				+ "                                      ");
		System.out.print("Você então reúne alguns recursos e parte para a Floresta na qual os monstros se originam."
				+ "\nAssim que você adentra um pouco a Floresta o clima já fica mais Sombrio e a mata mais fechada."
				+ "\nNão demorou muito para encontrar o primeiro monstro no seu caminho uma aranha gigantesca."
				+ "\nEla possivelmente tinha 1 metro de altura."
				+ "\nLogo que cruzam olhares, o combate se inicia.\n");
		ComandosLogico.pararJogo();

		//Inicia sistema de combate
		CombateAranha.iniciar();

		ComandosLogico.limparConsole();
		ComandosLogico.printTitulo("______ _                     _        \r\n"
				+ "|  ___| |                   | |       \r\n"
				+ "| |_  | | ___  _ __ ___  ___| |_ __ _ \r\n"
				+ "|  _| | |/ _ \\| '__/ _ \\/ __| __/ _` |\r\n"
				+ "| |   | | (_) | | |  __/\\__ \\ || (_| |\r\n"
				+ "\\_|   |_|\\___/|_|  \\___||___/\\__\\__,_|\r\n"
				+ "                                      \r\n"
				+ "                                      ");
		System.out.print("Após derrotar a aranha você segue em seu caminho na procura do monstro responsável pelos ataques."
				+ "\nPelo caminho vê pegadas enormes e árvores caídas o que indicava que estava próximo do seu alvo."
				+ "\nVocê chegou a uma clareira e decidiu se recompor para a Batalha final."
				+ "\nCome uns pães que havia levado e bebe água em seu cantil."
				+ "\nVocê trata suas feridas e deita-se um pouco para descansar e acaba cochilando.\n");
		ComandosLogico.pararJogo();

		ComandosLogico.limparConsole();
		ComandosLogico.printTitulo("______ _                     _        \r\n"
				+ "|  ___| |                   | |       \r\n"
				+ "| |_  | | ___  _ __ ___  ___| |_ __ _ \r\n"
				+ "|  _| | |/ _ \\| '__/ _ \\/ __| __/ _` |\r\n"
				+ "| |   | | (_) | | |  __/\\__ \\ || (_| |\r\n"
				+ "\\_|   |_|\\___/|_|  \\___||___/\\__\\__,_|\r\n"
				+ "                                      \r\n"
				+ "                                      ");
		System.out.print("Você é acordado pelo estrondo de uma árvore sendo derrubada quase que imediatamente."
				+ "\nVocê vê um lobo selvagem sendo arremessado, que caí ao centro da clareira já sem vida"
				+ "\nEntão você se esconde atrás da árvore pois imaginava quem havia arremessado o lobo."
				+ "\nE ele possivelmente era um monstro mais forte do Floresta.\n");
		ComandosLogico.pararJogo();
						
		ComandosLogico.limparConsole();
		ComandosLogico.printTitulo("______ _                     _        \r\n"
				+ "|  ___| |                   | |       \r\n"
				+ "| |_  | | ___  _ __ ___  ___| |_ __ _ \r\n"
				+ "|  _| | |/ _ \\| '__/ _ \\/ __| __/ _` |\r\n"
				+ "| |   | | (_) | | |  __/\\__ \\ || (_| |\r\n"
				+ "\\_|   |_|\\___/|_|  \\___||___/\\__\\__,_|\r\n"
				+ "                                      \r\n"
				+ "                                      ");
		System.out.print("Não demorou muito para a suas suspeitas serem confirmadas, um ORC de 4 metros aparece."
				+ "\nEle vai em direção ao lobo que ele havia arremessado pouco antes e começa a devora-lo."
				+ "\nVocê aguarda o ORC se encontrar em uma posição vulnerável para lançar o ataque."
				+ "\nNão demora muito, já que o ORC deixa sua clava jogada para se alimentar do lobo."
				+ "\nEntão você vai vagarosamente se posicionando pelas costas do monstro."
				+ "\nE quando vê que está numa posição perfeita o ataca ferozmente.\n");
		ComandosLogico.pararJogo();

		//Inicia sistema de combate
		CombateOrc.iniciar();

		ComandosLogico.limparConsole();
		ComandosLogico.printTitulo("______ _                     _        \r\n"
				+ "|  ___| |                   | |       \r\n"
				+ "| |_  | | ___  _ __ ___  ___| |_ __ _ \r\n"
				+ "|  _| | |/ _ \\| '__/ _ \\/ __| __/ _` |\r\n"
				+ "| |   | | (_) | | |  __/\\__ \\ || (_| |\r\n"
				+ "\\_|   |_|\\___/|_|  \\___||___/\\__\\__,_|\r\n"
				+ "                                      \r\n"
				+ "                                      ");
		System.out.print("Graças à sua astúcia e sua habilidade no combate você derrota o ORC sem muito esforço."
				+ "\nLogo se direciona para a cidade para informar aos cidadãos que o perigo foi eliminado."
				+ "\nAo chegar lá você é recebido de maneira calorosa pelos aldeões que o reverenciam e lhe agradecem."
				+ "\nEm especial a aldeã que lhe passou as informações, tamanha era a sua Felicidade."
				+ "\nVocê recebe recompensas de vários cidadãos e comerciantes locais."
				+ "\nNão demorou muito para a sua fama percorrer o Reino e ser reconhecido por onde passava."
				+ "\nVocê conseguiu finalmente ficar com a consciência limpa após ter fugido do combate em Single town.\n");
		ComandosLogico.pararJogo();

		//Fim de jogo
		ComandosLogico.limparConsole();
		System.out.print("______ _                 _          _                     _ \r\n"
				+ "|  ___(_)               | |        (_)                   | |\r\n"
				+ "| |_   _ _ __ ___     __| | ___     _  ___   __ _  ___   | |\r\n"
				+ "|  _| | | '_ ` _ \\   / _` |/ _ \\   | |/ _ \\ / _` |/ _ \\  | |\r\n"
				+ "| |   | | | | | | | | (_| |  __/   | | (_) | (_| | (_) | |_|\r\n"
				+ "\\_|   |_|_| |_| |_|  \\__,_|\\___|   | |\\___/ \\__, |\\___/  (_)\r\n"
				+ "                                  _/ |       __/ |          \r\n"
				+ "                                 |__/       |___/           \n\n");
		ComandosLogico.pararJogo();
	}

}
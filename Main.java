import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("+===============================================================+");
		System.out.println("Bem-vindo(a) ao RPG de Texto!");
		System.out.print("Digite o nome do seu personagem: ");
		String nome = scanner.nextLine();
		System.out.println("+===============================================================+");

		System.out.println("\n+===============================================================+");
		System.out.println("Escolha uma classe para o seu personagem: ");
		System.out.println("1. Guerreiro");
		System.out.println("2. Mago");
		System.out.println("3. Assassino");
		System.out.println("4. Arqueiro");
		System.out.print("Digite o número da classe desejada: ");
		int escolha = scanner.nextInt();
		System.out.println("+===============================================================+");

		ClassePersonagem classe;

		switch (escolha) {
		case 1:
			classe = ClassePersonagem.GUERREIRO;
			break;
		case 2:
			classe = ClassePersonagem.MAGO;
			break;
		case 3:
			classe = ClassePersonagem.ASSASSINO;
			break;
		case 4:
			classe = ClassePersonagem.ARQUEIRO;
			break;
		default:
			System.out.println("Opção inválida! Escolhendo a classe Guerreiro por padrão.");
			classe = ClassePersonagem.GUERREIRO;
			break;
		}

		// Crie o objeto do personagem com base na classe escolhida
		Personagem personagem = new Personagem(nome, classe);

		// Cenário de fundo e diálogo
		System.out.println("\n+===============================================================+");
		System.out.println("Bem-vindo " + personagem.getNome() + " ao mundo de SingleTown!...");
		System.out.println("Você assume o papel de um " + personagem.getClasse().toString() + " que acaba de chegar nesta cidade pacífica.");
		System.out.println("No entanto, sua chegada é tumultuada, pois você logo percebe um fluxo constante de pessoas em fuga.");
		System.out.println("Intrigado e preocupado, você se aproxima de um cidadão em pânico...");
		System.out.println("+===============================================================+");

		// Diálogo com NPC
		System.out.println("\n+===============================================================+");
		System.out.println(personagem.getNome() + ": Ei, o que está acontecendo aqui? Por que todo mundo está correndo?");
		System.out.println("Cidadão em pânico: É terrível! Uma horda de goblins invadiu nossa cidade! Eles estão destruindo tudo em seu caminho e atacando os moradores!");
		System.out.println(personagem.getNome() + ": Eu sou um(a) " + personagem.getClasse().toString() + ", treinado(a) para combate. Como posso ajudar?");
		System.out.println("Cidadão em pânico: Você pode ajudar a eliminar esses desgraçados ou pode nos ajudar a fugir da cidade para a floresta!");
		System.out.println("+===============================================================+");
		
		// Escolha de caminho

		System.out.println("\n+===============================================================+");
		System.out.println("Escolha o que fazer:");
		System.out.println("1. Ir para a cidade e lutar contra os goblins");
		System.out.println("2. Ajudar os cidadãos a fugir para a floresta");
		System.out.print("Digite o número da opção desejada: ");
		int ramificacao = scanner.nextInt();
		System.out.println("+===============================================================+");

		switch (ramificacao) {
		case 1:
			System.out.println(personagem.getNome() + ": Vamos enfrentar esses goblins! Vamos salvar a cidade!");
			// Lógica para a batalha contra os goblins
			break;
		case 2:
			System.out.println(personagem.getNome() + ": Vou ajudar os cidadãos a fugir para a floresta! Sigam-me!");
			// Lógica para ajudar os cidadãos a fugir para a floresta
			break;
		default:
			System.out.println(personagem.getNome() + ": Opção inválida. Vamos fazer algo rápido!");
			// Lógica para tratar opção inválida
			break;
		}
		
		scanner.close();
	}





}


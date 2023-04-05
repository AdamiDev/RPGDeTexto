package rpgdetexto.main;
import java.util.Scanner;

public class ComandosLogico {
	static Scanner scanner = new Scanner(System.in);

	//Método para limpar o console
	public static void limparConsole(){
		for(int i = 0; i < 100; i++)
			System.out.println();
	}

	//Método para separar console com gráficos
	public static void printGrafico(int n){
		for(int i = 0; i < n; i++)
			System.out.print("=");
		System.out.println("");
	}

	//Método para criar um titulo
	public static void printTitulo(String titulo){
		printGrafico(30);
		System.out.println(titulo);
		printGrafico(30);
	}

	//Método para parar o jogo até o usuário apertar algo
	public static void pararJogo(){
		System.out.println("\nPressione enter para continuar...");
		scanner.nextLine();
		scanner.nextLine();
	}

	//Método para o usuário escolher uma opção
	public static int leiaEscolha(String prompt, int escolhasUsuario){
		int input;

		do {
			System.out.println(prompt);
			try {
				input = Integer.parseInt(scanner.next());
			}catch(Exception e){
				input = -1;
				System.out.println("Por favor, insira um número inteiro.");
			}
		}while(input < 1 || input > escolhasUsuario);
		return input;
	}

}
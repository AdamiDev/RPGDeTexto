package rpgdetexto.main;
import java.util.Scanner;

public class Jogador {
	static Scanner scanner = new Scanner(System.in);
    static String nomeJogador;

    // Método para obter o nome do jogador
    public static String obterNome() {
        System.out.println("Qual o seu nome?");
        String nome = scanner.next();
        nomeJogador = nome;
        return nome;
	}

}
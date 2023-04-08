package rpgdetexto.main;

public class Historia {

	public static void introducao() {
		ComandosLogico.limparConsole();
		ComandosLogico.printTitulo("ASCII cidade");
		System.out.print("Após uma longa viagem que teve início nos reinos do norte, você chega a Singletown."
				+ "\nSingletown é uma cidade tranquila e acolhedora, localizada em um vale cercado por florestas."	
				+ "\nVocê estava cansado, com fome e com sede, mas ainda assim animado por estar chegando a um lugar novo."
				+ "\nAo se aproximar da cidade, você percebe um fluxo intenso de pessoas saindo às pressas."
				+ "\nIntrigado, você corre para um dos cidadãos e pergunta o que está acontecendo.\n");
		ComandosLogico.pararJogo();
			
	}
}
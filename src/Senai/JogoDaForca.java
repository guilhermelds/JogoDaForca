package Senai;

import java.util.Arrays;
import java.util.Scanner;

public class JogoDaForca extends Jogo{
	
	private String palavra1;
	private String letra;
	private int forca = 1;
	private int vencer = 0;
	private int perder = 0;
	private int contadorLetras = 0;
	private String letrasDigitadas[] = new String[20];
	
	public JogoDaForca(String nomeDoJogo, Jogadores competidor, Jogadores adversario) {
		super(nomeDoJogo, competidor, adversario);
		this.palavra1 = palavra1;
	}
	
	public String AddPalavra() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(this.getCompetidor() + " Digite Uma palavra");
		palavra1 = scanner.nextLine();
		return palavra1;
	}
	
	public String EscolheLetra() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(this.getAdversario() + " Digite Uma letra");
		letra = scanner.nextLine();
		return letra;
		
	}
	 
	public void AchaLetra() {
		AddPalavra();
		char palavra[] = palavra1.toCharArray();
		
		while (forca == 1) {
			int existeLetra = 0;
			EscolheLetra();
			letrasDigitadas[contadorLetras] = letra;
			
			for (int i = 0; i < letrasDigitadas.length; i++) {
				if (letrasDigitadas[i] != null) {
					if (letrasDigitadas[i].equals(letra)) {
						existeLetra++;
					}
				}
			}
			if (!(existeLetra > 1)) {
				for (int x = 0; x < palavra.length; x++) {
					if (String.valueOf(palavra[x]).equals(letra)) {
						System.out.println("Letra correta.");
						vencer++;
						break;
					} else {
						if ( x == palavra.length) {
						perder++;
							if(perder ==1) {
								System.out.println("Você perdeu o Braço Esquerdo");
							}
							else if(perder ==2 ) {
								System.out.println("Você perdeu o Braço Direito");
							}
							else if(perder ==3 ) {
								System.out.println("Você perdeu a Perna Direita");
							}
							else if(perder ==4 ) {
								System.out.println("Você perdeu a Perna esquerda");
							}
							else if(perder ==5 ) {
								System.out.println("Você perdeu a Cabeça");
						    }
					   }		
					}
					
				}
				if (perder == 5) {
					System.out.println(this.getCompetidor() + "Ganhou!!"+ " A palavra digitada era: " + this.palavra1);
					System.exit(0);
				} else if (vencer == palavra.length) {
					System.out.println(this.getAdversario() + "Ganhou! " );
					System.exit(0);
				}
			} else {
				System.out.println("Essa letra já foi digitada.");
			}
			contadorLetras++;
		}
	

	}
}

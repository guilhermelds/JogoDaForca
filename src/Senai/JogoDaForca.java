package Senai;

import java.util.Arrays;
import java.util.Scanner;

public class JogoDaForca extends Jogo{

	private String palavra1;
	private String letra;
	private int perder = 0;
	private int contadorLetras = 0;
	private int cont = 0;
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

		while (true) {
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
						for (char c : palavra) {
							if(c == letra.charAt(0)) {
								cont++;
							}
						}
						System.out.println("Letra correta.");
						break;
					} else {

						if ( x == (palavra.length -1)) {
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
					break;
				} else if (cont == palavra.length) {
					System.out.println(this.getAdversario() + "Ganhou! " );
					break;
				}
			} else {
				System.out.println("Essa letra já foi digitada.");
			}
			contadorLetras++;
		}
	}

	public String getPalavra1() {
		return palavra1;
	}

	public void setPalavra1(String palavra1) {
		this.palavra1 = palavra1;
	}

	public String[] getLetrasDigitadas() {
		return letrasDigitadas;
	}

	public void setLetrasDigitadas(String[] letrasDigitadas) {
		this.letrasDigitadas = letrasDigitadas;
	}
	
	
}

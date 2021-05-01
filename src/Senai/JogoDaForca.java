package Senai;

import java.util.Arrays;
import java.util.Scanner;
/**
 * Classe responsável pelas regras/condições do jogo da forca
 * @author Grupo
 *
 */
public class JogoDaForca extends Jogo{

	private String palavra1;
	private String letra;
	private int perder = 0;
	private int contadorLetras = 0;
	private int cont = 0;
	private String letrasDigitadas[] = new String[20];
	
	
	/**
	 * Chama a class main, para incluir os jogadores no jogo
	 * @param nomeDoJogo Obtem informações da class Jogo
	 * @param competidor Obtem informações da class Jogo
	 * @param adversario Obtem informações da class Jogo
	 */
	public JogoDaForca(String nomeDoJogo, Jogadores competidor, Jogadores adversario) {
		super(nomeDoJogo, competidor, adversario);
		this.palavra1 = palavra1;
	}
	
	/**
	 * Armazena a palavra que deverá ser advinhada pelo jogador adversário
	 * @return retorna a palavra digitada
	 */
	public String AddPalavra() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(this.getCompetidor() + " Digite Uma palavra");
		palavra1 = scanner.nextLine();
		return palavra1;
		
	}
	
	/**
	 * Armazena a letra digitada pelo adversário 
	 * @return retorna letra digitada
	 */
	public String EscolheLetra() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(this.getAdversario() + " Digite Uma letra");
		letra = scanner.nextLine();
		return letra;

	}
	/**
	 * Verifica se a letra digitada esta presente no AddPalavra, caso a letra corresponda com alguma da palavra, retorna "Letra Correta"
	 * caso a letra seja incorreta ele entra na condição IF informando que algum membro foi perdido.
	 * 
	 * 
	 */
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
								System.out.println("   _____");
					            System.out.println("   |   |");
					            System.out.println("   O   |");
					            System.out.println("       |");
					            System.out.println("       |");
					            System.out.println("_______|");
					            System.out.println("Errou a primeira tentativa, mas ainda tem 4 chances ");
							}
							else if(perder ==2 ) {
								System.out.println("   _____");
					            System.out.println("   |   |");
					            System.out.println("   O   |");
					            System.out.println("  /|   |");
					            System.out.println("       |");
					            System.out.println("_______|");
					            System.out.println("Errou a segunda tentativa, mas ainda tem 3 chances ");
							}
							else if(perder ==3 ) {
								System.out.println("   _____");
					            System.out.println("   |   |");
					            System.out.println("   O   |");
					            System.out.println("  /|\\  |");
					            System.out.println("       |");
					            System.out.println("_______|");
					            System.out.println("Atenção! Errou a terceira tentativa, só tem 2 chances ");
							}
							else if(perder ==4 ) {
								System.out.println("   _____");
					            System.out.println("   |   |");
					            System.out.println("   O   |");
					            System.out.println("  /|\\  |");
					            System.out.println("  /    |");
					            System.out.println("_______|");
					            System.out.println("Cuidado! Errou a quarta tentativa, só tem 1 chance ");
							}
							else if(perder ==5 ) {
								System.out.println("   _____");
						        System.out.println("   |   |");
						        System.out.println("   O   |");
						        System.out.println("  /|\\  |");
						        System.out.println("  / \\  |");
						        System.out.println("_______|");
						        System.out.println("Que pena, você perdeu. Tente mais tarde");
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

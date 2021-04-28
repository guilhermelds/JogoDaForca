package Senai;

import java.util.Arrays;
import java.util.Scanner;

public class JogoDaForca extends Jogo{
	private String palavra;
	private String letra;
	private int contaPalavras = 0;
	private String acerta[] = {};
	
	public JogoDaForca(String nomeDoJogo, Jogadores competidor, Jogadores adversario, String palavra) {
		super(nomeDoJogo, competidor, adversario);
		this.palavra = palavra;
	}
	
	public String AddPalavra() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(this.getCompetidor() + " Digite Uma palavra");
		palavra = scanner.nextLine();
		System.out.println(palavra);	
		return palavra;
		
	}
	
	public String EscolheLetra() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(this.getAdversario() + " Digite Uma letra");
		letra = scanner.nextLine();
//		System.out.println(letra);	
		return letra;
		
	}
	 
	public String AchaLetra() {
		
        	for(int i=0;i<palavra.length();i++) {
        		char palavraConvertida = palavra.charAt(i);
        		char letraConvertida[] = letra.toCharArray();
        		if (letraConvertida[0] == palavraConvertida) {
//        			acertar[] = letra;
        			contaPalavras++;
        		}
        		else {
        			
        		}
        	}
        	System.out.println();
        	return null;
        
		}
	public void njogada() {
		while (contaPalavras < palavra.length()) {
			EscolheLetra();
			AchaLetra();
			
		}
	}
}

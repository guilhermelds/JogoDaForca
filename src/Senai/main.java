package Senai;


/** 
 * Classe responsável pela adição de jogadores e inicio de partida
 * 
 *
 */
public class main {

	public static void main(String[] args) {
		
		Jogadores jogador1 = new Jogadores("Gui");
		Jogadores jogador2 = new Jogadores("Evandro");
		Jogadores jogador3 = new Jogadores("Carlos");
		Jogadores jogador4 = new Jogadores("Marcelo");
		
		JogoDaForca jogo1 = new JogoDaForca("Jogo Da Forca", jogador1, jogador3);
		jogo1.AchaLetra();
		
		System.out.println("Novo jogo");
		
		JogoDaForca jogo2 = new JogoDaForca("Jogo Da Forca", jogador2, jogador4);
		jogo2.AchaLetra();
		
		
		
		
		
	}

}

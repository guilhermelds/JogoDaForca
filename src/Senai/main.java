package Senai;

public class main {

	public static void main(String[] args) {
		
		Jogadores jogador1 = new Jogadores("Gui");
		Jogadores jogador2 = new Jogadores("Evandro");
		Jogadores jogador3 = new Jogadores("Carlos");
		Jogadores jogador4 = new Jogadores("Marcelo");
		
		JogoDaForca jogo1 = new JogoDaForca(null, jogador1, jogador3, null);
		jogo1.AddPalavra();
		jogo1.njogada();
		
		
		
		
		
	}

}

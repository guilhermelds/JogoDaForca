package Senai;

public class Jogo {
	private String nomeDoJogo;
	private Jogadores competidor;
	private Jogadores adversario;
	public Jogo(String nomeDoJogo, Jogadores competidor, Jogadores adversario) {
		super();
		this.nomeDoJogo = nomeDoJogo;
		this.competidor = competidor;
		this.adversario = adversario;
	}
	public String getNomeDoJogo() {
		return nomeDoJogo;
	}
	public void setNomeDoJogo(String nomeDoJogo) {
		this.nomeDoJogo = nomeDoJogo;
	}
	public Jogadores getCompetidor() {
		return competidor;
	}
	public void setCompetidor(Jogadores competidor) {
		this.competidor = competidor;
	}
	public Jogadores getAdversario() {
		return adversario;
	}
	public void setAdversario(Jogadores adversario) {
		this.adversario = adversario;
	}
	@Override
	public String toString() {
		return "Jogo [nomeDoJogo=" + nomeDoJogo + ", competidor=" + competidor + ", adversario=" + adversario + "]";
	}

}

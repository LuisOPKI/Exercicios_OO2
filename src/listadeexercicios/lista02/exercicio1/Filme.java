package listadeexercicios.lista02.exercicio1;

public class Filme {
	private String nome;
	private int duracao;
	
	public Filme(String nome, int duracao) {
		this.nome = nome;
		this.duracao = duracao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	
}

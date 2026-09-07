package listadeexercicios.lista02.exercicio1;

public class Sessao {
	private Sala sala;
	private Filme filme;
	private String data;
	private String horario;
	private Integer numeroIngressos;
	
	public Sessao( String data, String horario, Sala sala, Filme filme) {
		this.sala = sala;
		this.filme = filme;
		this.data = data;
		this.horario = horario;
		this.numeroIngressos = sala.getCapacidadeMax();
	}
	
	public void venderIngresso(int quant) {
		if(quant <= numeroIngressos && quant > 0) {
			this.numeroIngressos -= quant;
			System.out.println("Foram comprados " + quant + " ingressos!");
		}
		else {
			System.out.println("A quantidade de ingressos não está disponivel!");
		}
	}
	
	public void exibirRelatorio() {
		System.out.println("---------------------------------");
		System.out.println("Data da Sessão: " + this.data);
		System.out.println("Horário da Sessão: " + this.horario);
		System.out.println("Ingressos vendidos: " + (this.sala.getCapacidadeMax() - this.numeroIngressos));
		System.out.println("Ingressos disponíveis: " + this.numeroIngressos);
		System.out.println("Número da Sala: " + this.sala.getNumeroId());
		System.out.println("Nome do filme: " + this.filme.getNome());
		System.out.println("Duração do filme: " + this.filme.getDuracao());
	}
	

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Integer getNumeroIngressos() {
		return numeroIngressos;
	}

	public void setNumeroIngressos(Integer numeroIngressos) {
		this.numeroIngressos = numeroIngressos;
	}
	
	
}

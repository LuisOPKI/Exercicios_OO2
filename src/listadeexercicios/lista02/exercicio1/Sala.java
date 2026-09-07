package listadeexercicios.lista02.exercicio1;

public class Sala {
	private int numeroId;
	private int capacidadeMax;
	
	public Sala(int numeroId, int capacidadeMax) {
		this.numeroId = numeroId;
		this.capacidadeMax = capacidadeMax;
	}

	public int getNumeroId() {
		return numeroId;
	}

	public void setNumeroId(int numeroId) {
		this.numeroId = numeroId;
	}

	public int getCapacidadeMax() {
		return capacidadeMax;
	}

	public void setCapacidadeMax(int capacidadeMax) {
		this.capacidadeMax = capacidadeMax;
	}
	
	
}

package atividadesdeaula.aula7;

public class Quarto {
	private int numId;
	private TipoQuarto tipo;
	private Double valorDiaria;
	private boolean disponibilidade;
	public Quarto(int numId, TipoQuarto tipo, Double valorDiaria, boolean disponibilidade) {
		this.numId = numId;
		this.tipo = tipo;
		this.valorDiaria = valorDiaria;
		this.disponibilidade = disponibilidade;
	}
	public int getNumId() {
		return numId;
	}
	public TipoQuarto getTipo() {
		return tipo;
	}
	public Double getValorDiaria() {
		return valorDiaria;
	}
	public boolean isDisponibilidade() {
		return disponibilidade;
	}
	
}

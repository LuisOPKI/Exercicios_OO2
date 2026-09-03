package atividadesdeaula.aula3;

public class SistemaDeTributacao {
	private Double valorDoBem;
	private Imposto imposto; 

	public SistemaDeTributacao(Double valorDoBem, Imposto imposto) {
		this.valorDoBem = valorDoBem;
		this.imposto = imposto;
	}
	public Double Imposto() {
		Double valorImposto = this.imposto.calcularImposto(valorDoBem);
		return valorImposto;
	}
	
}

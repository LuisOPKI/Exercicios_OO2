package atividadesdeaula.aula3;

public class SistemaDeTributacao {
	private Double valorDoBem;
	private Imposto imposto;

	public SistemaDeTributacao(Double valorDoBem, Imposto imposto) {
		this.valorDoBem = valorDoBem;
		this.imposto = imposto;
	}


	public void calcularImposto(){
		System.out.println("O valor do imposto a ser pago pelo seu bem é " + this.imposto.calcularImposto(valorDoBem));
	}
	
}

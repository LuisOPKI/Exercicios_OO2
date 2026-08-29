package atividadesdeaula.aula3;

public class Inss implements Imposto{
	private final Double porcentagem;

	public Inss() {
		this.porcentagem = 0.11;
	}

	@Override
	public Double calcularImposto(Double valor) {
		return this.porcentagem*valor;
	}
	
	
}

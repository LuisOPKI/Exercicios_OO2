package atividadesdeaula.aula3;

public class Iof implements Imposto{
	private final Double porcentagem;

	public Iof() {
		this.porcentagem = 0.06;
	}

	@Override
	public Double calcularImposto(Double valor) {
		return this.porcentagem*valor;
	}
	
	
}

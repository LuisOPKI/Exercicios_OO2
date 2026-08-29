package atividadesdeaula.aula3;

public class Ipva implements Imposto{
	private final Double porcentagem;

	public Ipva() {
		this.porcentagem = 0.03;
	}

	@Override
	public Double calcularImposto(Double valor) {
		return this.porcentagem*valor;
	}
	
	
}

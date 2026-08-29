package atividadesdeaula.aula3;

public class Irpf implements Imposto{
	private final Double porcentagem;

	public Irpf() {
		this.porcentagem = 0.075;
	}

	@Override
	public Double calcularImposto(Double valor) {
		return this.porcentagem*valor;
	}
	
	
}

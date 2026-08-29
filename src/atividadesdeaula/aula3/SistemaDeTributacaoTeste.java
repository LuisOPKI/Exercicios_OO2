package atividadesdeaula.aula3;

public class SistemaDeTributacaoTeste {
	public static void main(String[] args) {
		SistemaDeTributacao sis = new SistemaDeTributacao(10000.00, new Ipva());
		
		sis.calcularImposto();
	}
}

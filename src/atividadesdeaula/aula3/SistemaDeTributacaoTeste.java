package atividadesdeaula.aula3;

public class SistemaDeTributacaoTeste {
	public static void main(String[] args) {
		SistemaDeTributacao sis = new SistemaDeTributacao(10000.00, new Irpf());
		System.out.println("O valor do imposto é: " + sis.Imposto());
		SistemaDeTributacao sas = new SistemaDeTributacao(10000.00, new Ipva());
		System.out.println("O valor do imposto é: " + sas.Imposto());
		SistemaDeTributacao ses = new SistemaDeTributacao(10000.00, new Iof());
		System.out.println("O valor do imposto é: " + ses.Imposto());
		SistemaDeTributacao sos = new SistemaDeTributacao(10000.00, new Inss());
		System.out.println("O valor do imposto é: " + sos.Imposto());
	}
}

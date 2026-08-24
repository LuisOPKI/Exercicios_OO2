package atividadesdeaula.aula1;

public class Professor extends Pessoa2{
	private Double salarioBase;
	private Titulacao titulacao;
	
	public Professor(String nome, Integer idade, Endereco endereco, Double salarioBase, Titulacao titulacao) {
		super(nome, idade, endereco);
		this.salarioBase = salarioBase;
		this.titulacao = titulacao;
	}

	@Override
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Salário Base: " + this.salarioBase);
		System.out.println("Titulação: " + this.titulacao);
		this.calcularSalario();
	}

	public Double calcularSalario() {
		if(this.titulacao == Titulacao.MESTRE) {
			return (this.salarioBase + 3000.00);
		}
		else {
			return (this.salarioBase + 5000.00);
		}
	}
}

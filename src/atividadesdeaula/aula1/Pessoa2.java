package atividadesdeaula.aula1;

public class Pessoa2 {
	protected String nome;
	protected Integer idade;
	protected Endereco endereco;
	
	public Pessoa2(String nome, Integer idade, Endereco endereco) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
	}

	public void imprimirDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade " + this.idade);
	}
}

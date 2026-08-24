package atividadesdeaula.aula1;

public class Pessoa {
	private String nome;
	private String dataNascimento;
	private String sexo;
	private String email;
	private EstadoCivil estadoCivil;
	private Endereco endereco;
	

	public Pessoa(String nome, String dataNascimento, String sexo, String email, EstadoCivil estadoCivil,
			Endereco endereco) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.email = email;
		this.estadoCivil = estadoCivil;
		this.endereco = endereco;
	}
	
	public void imprimirDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Data de Nascimento: " + this.dataNascimento);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("Email: " + this.email);
		System.out.println("Estado Civil: " + this.estadoCivil);
		System.out.println("Logradouro: " + endereco.getLogradouro());
		System.out.println("Número: " + endereco.getNumero());
		System.out.println("Bairro: " + endereco.getBairro());
		System.out.println("Cidade: " + endereco.getCidade());
		System.out.println("UF: " + endereco.getUf());
	}
}

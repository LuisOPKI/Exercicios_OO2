package atividadesdeaula.aula4;

public class Contato {
	private String nome;
	private String sobrenome;
	private String numero;
	private String endereco;
	private String dataAniversario;
	
	public Contato(String nome, String sobrenome, String numero, String endereco, String dataAniversario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.numero = numero;
		this.endereco = endereco;
		this.dataAniversario = dataAniversario;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getNumero() {
		return numero;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getDataAniversario() {
		return dataAniversario;
	}
	public void exibirDados() {
		System.out.println(this.nome + " " + this.sobrenome);
		System.out.println(this.numero);
		System.out.println(this.endereco);
		System.out.println(this.dataAniversario);
	}
}

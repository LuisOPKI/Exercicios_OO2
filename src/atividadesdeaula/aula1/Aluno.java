package atividadesdeaula.aula1;

public class Aluno extends Pessoa2{
	private String curso;

	public Aluno(String nome, Integer idade, Endereco endereco) {
		super(nome, idade, endereco);
		this.curso = null;
	}

	@Override
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Curso: " + this.curso);
	}
	
	public void realizarMatricula(String curso) {
		this.curso = curso;
		System.out.println("Você foi matriculado no curso: " + this.curso);
	}
}

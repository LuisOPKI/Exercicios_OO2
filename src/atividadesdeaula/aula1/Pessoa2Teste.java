package atividadesdeaula.aula1;

public class Pessoa2Teste {
	    public static void main(String[] args) {
	        Endereco endereco = new Endereco("Rua das Flores", 123, "Centro", "Curitiba", "PR");

	        Professor professor = new Professor("João Silva", 45, endereco, 5000.00, Titulacao.DOUTOR);
	        professor.imprimirDados();
	        System.out.println("Salário Calculado: " + professor.calcularSalario());

	        Aluno aluno = new Aluno("Maria Souza", 20, endereco);
	        aluno.realizarMatricula("Ciência da Computação");
	        aluno.imprimirDados();
	    }
	}

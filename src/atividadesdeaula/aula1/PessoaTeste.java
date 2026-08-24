package atividadesdeaula.aula1;

public class PessoaTeste {
	    public static void main(String[] args) {
	        
	        // Instanciando Pessoa e passando uma nova instância de Endereco diretamente como parâmetro
	        Pessoa pessoa = new Pessoa(
	            "Carlos de Almeida",           // nome
	            "15/08/1995",                  // dataNascimento
	            "Masculino",                   // sexo
	            "carlos.almeida@email.com",    // email
	            EstadoCivil.SOLTEIRO,          // estadoCivil
	            new Endereco(                  // Instanciação do Endereço "inline"
	                "Rua das Acácias",         // logradouro
	                1250,                      // numero
	                "Jardim Botânico",         // bairro
	                "Curitiba",                // cidade
	                "PR"                       // uf
	            )
	        );

	        // Chamando o método para imprimir os dados no console
	        pessoa.imprimirDados();
	    }
	}

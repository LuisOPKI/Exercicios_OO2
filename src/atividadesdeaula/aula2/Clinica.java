package atividadesdeaula.aula2;

import java.util.ArrayList;
import java.util.List;

public class Clinica {
	private String cnpj;
	private String razaoSocial;
	private List<Mamifero> mamiferos;
	
	public Clinica(String cnpj, String razaoSocial, List<Mamifero> mamifero) {
		super();
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.mamiferos = new ArrayList<>();
	}

	public void cadastrar(Mamifero mamifero) {
		
	}
	
	public void listarAnimais() {
		
	}
}

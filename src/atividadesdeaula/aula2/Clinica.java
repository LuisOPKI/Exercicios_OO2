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
		this.mamiferos = new ArrayList<Mamifero>();
	}

	public void cadastrar(String nome, String raca) {
		this.mamiferos.add(new Mamifero(nome, raca));
	}
	
	public void listarAnimais() {
		
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public List<Mamifero> getMamiferos() {
		return mamiferos;
	}

	public void setMamiferos(List<Mamifero> mamiferos) {
		this.mamiferos = mamiferos;
	}
	
}

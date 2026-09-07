package atividadesdeaula.aula4;

import java.util.List;
import java.util.ArrayList;

public class AgendaContatos {
	private List<Contato> contatos;

	public AgendaContatos() {
		this.contatos = new ArrayList<Contato>();
	}
	
	public void adicionarContatos(Contato contatoNovo) {
		for (Contato contato : contatos) {
			if(contato == contatoNovo) {
				System.out.println("Contato já existente!");
				return;
			}
		}
		this.contatos.add(contatoNovo);
		System.out.println("Contato adicionado!");
	}
	
	public void removerContato(String numero){
		for(Contato contato : contatos) {
			if(numero.equalsIgnoreCase(contato.getNumero()))
			System.out.println("Contato removido!");
		}
	}
	
	public void listaContatos() {
		for (Contato contato : contatos) {
			contato.exibirDados();
		}
	}
	
	public void acharContato(String nome) {
		for(Contato contato : contatos) {
			if(contato.getNome().contains(nome))
				contato.exibirDados();
		}
	}
}


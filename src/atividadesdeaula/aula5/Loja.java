package atividadesdeaula.aula5;

import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

public class Loja {
	private Integer cnpj;
	private String nomeLoja;
	
	private Map<Integer, Produto> produtos;

	public Loja(Integer cnpj, String nomeLoja) {
		this.cnpj = cnpj;
		this.nomeLoja = nomeLoja;
		this.produtos = new HashMap<>();
	}
	
	public void adicionarNovoProduto(Integer cod, String nome, Double valor) {
		if(this.produtos.containsKey(cod)) {
			System.out.println("O já existe um código para este produto!");
			return;
		}
		this.produtos.put(cod, new Produto(cod, nome, valor));
		System.out.println("O produto " + nome + " foi adicionado!");
	}
	
	public void exibirTodosProdutos() {
		if(this.produtos.isEmpty()) {
			System.out.println("Nada a ser feito por aqui!");
			return;
		}
		for (Entry<Integer, Produto> entry : produtos.entrySet()) {
			
			int chave = entry.getKey();
			Produto produto = entry.getValue();
			
			System.out.println("Chave: " + chave);
			System.out.println("Código: " + produto.getCodigo());
			System.out.println("Nome: " + produto.getNome());
			System.out.println("Preço: " + produto.getPreco());
		}
	}
	public void buscarProdutoPorCodigo(Integer codigo) {
		for(Integer chave : produtos.keySet()) {
			if(chave == codigo) {
				Produto produto = produtos.get(chave);
				System.out.println("Chave: " + chave);
				System.out.println("Código: " + produto.getCodigo());
				System.out.println("Nome: " + produto.getNome());
				System.out.println("Preço: " + produto.getPreco());
				return;
			}
		}
		System.out.println("Nenhum produto com esse código encontrado!");
	}
	public void atualizarPrecoProduto(Integer cod,Double novoValor) {
		Produto produto = produtos.get(cod);
		if(cod == produto.getCodigo()) {
			produto.setPreco(novoValor);
			System.out.println("Valor do Produto alterado!");
		}
		else {
			System.out.println("Produto não encontrado!");
		}

	}
	public void removerProduto(Integer cod) {
		Produto produto = produtos.get(cod);
		if(cod == produto.getCodigo()) {
			produtos.remove(cod, produto);
			System.out.println("Produto removido!");
		}
		else {
			System.out.println("Produto não encontrado!");
		}

	}
	public void calcularPrecoMedio() {
		if(produtos.isEmpty()) {
			System.out.println("Não há valores");
			return;
		}
		Double aux = 0.00;
		int aux2 = 0;
		for (Produto produto : produtos.values()){
			aux += produto.getPreco();
			aux2 ++;
		}
		System.out.println("O preço médio dos valores é: " + ((Double)aux/aux2));
	}

	public Integer getCnpj() {
		return cnpj;
	}

	public String getNomeLoja() {
		return nomeLoja;
	}

	public Map<Integer, Produto> getProdutos() {
		return produtos;
	}
	
}

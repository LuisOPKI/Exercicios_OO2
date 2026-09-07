package atividadesdeaula.aula5;

public class LojaTeste {
	public static void main(String[] args) {
		Loja minhaLoja = new Loja(12345678, "Tech Store");

        System.out.println("\n--- Adicionando Produtos ---");
        minhaLoja.adicionarNovoProduto(101, "Notebook Dell", 4500.00);
        minhaLoja.adicionarNovoProduto(102, "Mouse Sem Fio", 120.50);
        minhaLoja.adicionarNovoProduto(103, "Teclado Mecânico", 350.00);

        System.out.println("\n--- Exibindo Todos ---");
        minhaLoja.exibirTodosProdutos();

        System.out.println("\n--- Buscando por Código ---");
        minhaLoja.buscarProdutoPorCodigo(102);
        minhaLoja.buscarProdutoPorCodigo(999); // Teste de erro

        System.out.println("\n--- Atualizando Preço ---");
        minhaLoja.atualizarPrecoProduto(101, 4200.00);

        System.out.println("\n--- Calculando Preço Médio ---");
        minhaLoja.calcularPrecoMedio();

        System.out.println("\n--- Removendo Produto ---");
        minhaLoja.removerProduto(103);
        
        System.out.println("\n--- Situação Final ---");
        minhaLoja.exibirTodosProdutos();
        minhaLoja.calcularPrecoMedio();
	}
}

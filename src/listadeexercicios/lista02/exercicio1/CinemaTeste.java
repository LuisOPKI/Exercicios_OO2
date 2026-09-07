package listadeexercicios.lista02.exercicio1;

public class CinemaTeste {
	public static void main(String[] args) {
		Cinema meuCinema = new Cinema();

        Filme filme1 = new Filme("O Auto da Compadecida 2", 120);
        Filme filme2 = new Filme("Duna: Parte 2", 166);

        Sala sala1 = new Sala(1, 100);
        Sala sala2 = new Sala(2, 50);

        Sessao sessao1 = new Sessao("10/09/2026", "19:00", sala1, filme1);
        Sessao sessao2 = new Sessao("10/09/2026", "21:30", sala2, filme2);

        meuCinema.adicionarNovaSessao(sessao1);
        meuCinema.adicionarNovaSessao(sessao2);

        System.out.println("\n--- Simulando Vendas ---");
        sessao1.venderIngresso(10);
        sessao1.venderIngresso(5);
        sessao2.venderIngresso(60);
        sessao2.venderIngresso(50);

        meuCinema.exibirRelatorio();
    }
}

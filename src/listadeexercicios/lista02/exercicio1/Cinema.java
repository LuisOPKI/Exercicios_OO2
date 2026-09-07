package listadeexercicios.lista02.exercicio1;

import java.util.List;
import java.util.ArrayList;

public class Cinema {
	private List<Sessao> sessoes;

	public Cinema() {
		this.sessoes = new ArrayList<Sessao>();
	}
	
	public void adicionarNovaSessao(Sessao sessao) {
		this.sessoes.add(sessao);
	}
	
	public void exibirRelatorio() {
		for(Sessao sessao : sessoes) {
			sessao.exibirRelatorio();
		}
	}
}

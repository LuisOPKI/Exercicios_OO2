package listadeexercicios.lista01.exercicio2;

public class CartaodeCredito extends SistemadePagamentos{
	private int numCartao;
	private String nomeTitular;
	private String dataValidade;
	private int codigoSeguranca;
	
	public CartaodeCredito(Double valorTotalCompra, int numCartao, String nomeTitular, String dataValidade,
			int codigoSeguranca) {
		super(valorTotalCompra);
		this.numCartao = numCartao;
		this.nomeTitular = nomeTitular;
		this.dataValidade = dataValidade;
		this.codigoSeguranca = codigoSeguranca;
	}

	@Override
	public void pagamentoTotal() {
	}

	public int getNumCartao() {
		return numCartao;
	}

	public void setNumCartao(int numCartao) {
		this.numCartao = numCartao;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	public int getCodigoSeguranca() {
		return codigoSeguranca;
	}

	public void setCodigoSeguranca(int codigoSeguranca) {
		this.codigoSeguranca = codigoSeguranca;
	}
	
}

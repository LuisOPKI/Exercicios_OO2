package listadeexercicios.lista01.exercicio2;

public abstract class SistemadePagamentos {
	protected Double valorTotalCompra;
	
	public SistemadePagamentos(Double valorTotalCompra) {
		this.valorTotalCompra = valorTotalCompra;
	}

	public abstract void pagamentoTotal();
}

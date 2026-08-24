package listadeexercicios.lista01.exercicio1;

public abstract class FiguraGeometrica {
	protected String cor;

	public FiguraGeometrica(String cor) {
		this.cor = cor;
	}
	
	public abstract void calcularArea();
	public abstract void calcularPerimetro();
}

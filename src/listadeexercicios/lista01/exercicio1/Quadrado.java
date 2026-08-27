package listadeexercicios.lista01.exercicio1;

public class Quadrado extends FiguraGeometrica{
	private Double lado;

	public Quadrado(String cor, Double lado) {
		super(cor);
		this.lado = lado;
	}

	@Override
	public void calcularArea() {
		System.out.println("O lado do quadrado é: " + Math.pow(this.lado, 2));
	}

	@Override
	public void calcularPerimetro() {
		System.out.println("O perimetro do quadrado é: " + this.lado * 4);
	}
}

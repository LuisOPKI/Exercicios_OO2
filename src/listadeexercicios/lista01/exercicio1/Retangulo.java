package listadeexercicios.lista01.exercicio1;

public class Retangulo extends FiguraGeometrica{
	private Double base;
	private Double altura;
	public Retangulo(String cor, Double base, Double altura) {
		super(cor);
		this.base = base;
		this.altura = altura;
	}
	@Override
	public void calcularArea() {
		System.out.println("A área do retângulo é de: " + this.base*this.altura);		
	}
	@Override
	public void calcularPerimetro() {
		System.out.println("O perimetro do retângulo é: " + 2*(this.base*this.altura));
		
	}
	
	
}

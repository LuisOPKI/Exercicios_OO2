package listadeexercicios.lista01.exercicio1;

public class Circulo extends FiguraGeometrica{
	private Double diametro;
	private final Double PI;
	public Circulo(String cor, Double diametro) {
		super(cor);
		this.diametro = diametro;
		PI = 3.14;
	}
	@Override
	public void calcularArea() {
		System.out.println("A área do Circulo é: " + Math.pow((this.diametro/2),2) * this.PI );
		
	}
	@Override
	public void calcularPerimetro() {
		System.out.println("O perimetro do circulo é: " + PI * (this.diametro/2));
		
	}
	
}

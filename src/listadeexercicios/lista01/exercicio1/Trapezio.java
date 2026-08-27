package listadeexercicios.lista01.exercicio1;

public class Trapezio extends FiguraGeometrica{
	private Double B;
	private Double b;
	private Double h;
	private Double L1;
	private Double L2;
	
	public Trapezio(String cor, Double b, Double b2, Double h, Double l1, Double l2) {
		super(cor);
		this.B = b;
		this.b = b2;
		this.h = h;
		this.L1 = l1;
		this.L2 = l2;
	}
	@Override
	public void calcularArea() {
		System.out.println("A área do Trapézio é: " + ((this.B + this.b) * this.h)/2);
		
	}
	@Override
	public void calcularPerimetro() {
		System.out.println("O perimetro do Trapézio é: " + this.B+this.b+this.L1+this.L2);
	}
}

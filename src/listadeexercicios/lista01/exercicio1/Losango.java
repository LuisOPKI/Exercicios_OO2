package listadeexercicios.lista01.exercicio1;

public class Losango extends FiguraGeometrica{
	private Double D;
	private Double d;
	private Double l;
	public Losango(String cor, Double d, Double d2, Double l) {
		super(cor);
		this.D = d;
		this.d = d2;
		this.l = l;
	}
	@Override
	public void calcularArea() {
		System.out.println("A área do Losango é: " + (this.D*this.d)/2);
		
	}
	@Override
	public void calcularPerimetro() {
		System.out.println("O perimetro é: " + 4*this.l);
		
	}
	
	
	
}

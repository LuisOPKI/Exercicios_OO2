package listadeexercicios.lista01.exercicio1;

public class FiguraGeometricaTeste {
	public static void main(String[] args) {
		        // Instanciando as figuras e definindo a cor no construtor
		        Circulo circulo = new Circulo("Vermelho", 5.0);
		        Quadrado quadrado = new Quadrado("Azul", 4.0);
		        Retangulo retangulo = new Retangulo("Verde", 6.0, 3.0);
		        
		        // Trapézio: cor, baseMaior, baseMenor, altura, l1, l2
		        Trapezio trapezio = new Trapezio("Amarelo", 10.0, 6.0, 4.0, 5.0, 5.0); 
		        
		        // Losango: cor, diagonalMaior, diagonalMenor, lado (l)
		        Losango losango = new Losango("Roxo", 8.0, 6.0, 5.0);

		        // Criando um array com todas as figuras para facilitar a exibição usando Polimorfismo
		        FiguraGeometrica[] figuras = {circulo, quadrado, retangulo, trapezio, losango};

		        System.out.println("--- SISTEMA DE CÁLCULO GEOMÉTRICO ---\n");

		        for (FiguraGeometrica figura : figuras) {
		        	figura.calcularArea();
		        	figura.calcularPerimetro();
		        }
		    }
		}

package atividadesdeaula.aula6;

public class Calculadora {
	public void adicao(int a, int b) {
		try {
			int result = 0;
			result = a + b;
			System.out.println("Adição: " + result);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(Exception ae) {
			System.out.println(ae.getMessage());
		}
	}
	
	public void subtracao(int a, int b) {
		try {
			int result = 0;
			result = a - b;
			System.out.println("Subtração: " + result);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(Exception ae) {
			System.out.println(ae.getMessage());
		}
	}
	
	public void multiplicacao(int a, int b) {
		try {
			int result = 0;
			result = a * b;
			System.out.println("Multiplicação: " + result);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(Exception ae) {
			System.out.println(ae.getMessage());
		}
	}
	
	public void divisao(int a, int b) {
		try {
			int result = 0;
			result = a / b;
			System.out.println("Divisão: " + result);
		}catch(ArithmeticException e) {
			System.out.println("Impossível dividir por 0!");
		}catch(Exception ae) {
			System.out.println(ae.getMessage());
		}
	}
	public void potenciacao(int a, int b) {
		try {
			int result = 0;
			result = (int)Math.pow(a,b) ;
			System.out.println("Adição: " + result);
		}catch(ArithmeticException e) {
			System.out.println("O número não pode ser negativo");
		}catch(Exception ae) {
			System.out.println(ae.getMessage());
		}
	}
	public void raiz(int a) {
		try {
			int result = 0;
			result = (int)Math.sqrt(a) ;
			System.out.println("Adição: " + result);
		}catch(ArithmeticException e) {
			System.out.println("O número não pode ser negativo");
		}catch(Exception ae) {
			System.out.println(ae.getMessage());
		}
	}
	public void inverso(int a, int b) {
		try {
			int result = 0;
			result = a + b;
			System.out.println("Adição: " + result);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(Exception ae) {
			System.out.println(ae.getMessage());
		}
	}
}

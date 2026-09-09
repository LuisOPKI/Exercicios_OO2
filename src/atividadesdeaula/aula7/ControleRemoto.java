package atividadesdeaula.aula7;

public class ControleRemoto {
	private boolean estado;

	public ControleRemoto() {
		this.estado = false;
	}
	
	public void ligar() {
		try {
			if(this.estado == true) {
				throw new EstadoIgualException("O televisor já está ligado!");
			}
			else {
				this.estado = true;
				System.out.println("O televisor foi ligado!");
			}
		}catch(EstadoIgualException a) {
			System.err.println(a.getMessage());
		}catch(Exception e) {
			System.err.println("Erro não diagnosticado de entrada de dados!");
		}
	}
	
	public void desligar() {
		try {
			if(this.estado == false) {
				throw new EstadoIgualException("O televisor já está desligado!");
			}
			else {
				this.estado = false;
				System.out.println("O televisor foi ligado1");
			}
		}catch(EstadoIgualException a) {
			System.err.println(a.getMessage());
		}catch(Exception e) {
			System.err.println("Erro não diagnosticado de entrada de dados!");
		}
	}
	
}

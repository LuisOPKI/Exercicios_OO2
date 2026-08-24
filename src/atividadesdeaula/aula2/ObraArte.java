package atividadesdeaula.aula2;

public class ObraArte {
	private String autor;
	private Quadrilatero quadrilatero;

	public ObraArte(String autor, Quadrilatero quadrilatero) {
		this.autor = autor;
		this.quadrilatero = quadrilatero;
	}
	
	public void desenhar(Quadrilatero quadrilatero) {
		
	}
	
	public void exibirObra() {
		
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Quadrilatero getQuadrilatero() {
		return quadrilatero;
	}

	public void setQuadrilatero(Quadrilatero quadrilatero) {
		this.quadrilatero = quadrilatero;
	}
	
}

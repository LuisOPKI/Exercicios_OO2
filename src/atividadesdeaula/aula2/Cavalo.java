package atividadesdeaula.aula2;

public class Cavalo extends Mamifero{

	public Cavalo(String nome, String raca) {
		super(nome, raca);
	}

	@Override
	public void emitirSom() {
		System.out.println("Rinnn!");
	}
	
		
}

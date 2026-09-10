package atividadesdeaula.aula7;

public class Reserva {
	private Quarto quarto;
	private Hospede hospede;
	private int diasTotais;
	private Double valorTotal;
	
	public Reserva() {

		this.quarto = null;
		this.hospede = null;
		this.diasTotais = 0;
		this.valorTotal = 0.0;
	}



	public void realizarReserva(Quarto quarto, Hospede hospede, int diasTotais) throws QuartoNaoDisponivelException,HospedeNuloException,DiasTotaisInvalidosException{
		if(quarto.isDisponibilidade() != true) {
			throw new QuartoNaoDisponivelException("Quarto não dísponivel!");
		}else if(hospede == null){
			throw new HospedeNuloException("O hospede é nulo!");
		}else if(diasTotais <= 0 | diasTotais > 30) {
			throw new DiasTotaisInvalidosException("Os dias totais são inválidos!");
		}
	}
}

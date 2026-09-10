package atividadesdeaula.aula7;

public class ReservaTeste {
	public static void main(String[] args) {
		Reserva reserva1 = new Reserva();
		try {
			reserva1.realizarReserva(new Quarto(71, TipoQuarto.CASAL, 350.00, true ), new Hospede("182.291.212-22", "José Bonifacio"), 31);
		}catch(QuartoNaoDisponivelException a) {
			System.out.println(a.getMessage());
		}catch(HospedeNuloException b) {
			System.out.println(b.getMessage());
		}catch(DiasTotaisInvalidosException c) {
			System.out.println(c.getMessage());
		}
		
	}
}

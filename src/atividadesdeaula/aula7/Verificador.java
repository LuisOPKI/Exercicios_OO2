package atividadesdeaula.aula7;

public class Verificador {
	private Double nota1;
	private Double nota2;
	private Double nota3;
	private Double nota4;
	
	private int frequencia;
	private int totalAulas;

	public Verificador(Double nota1, Double nota2, Double nota3, Double nota4, int frequencia, int totalAulas) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nota4 = nota4;
		this.frequencia = frequencia;
		this.totalAulas = totalAulas;
	}
	
	public void verificarAprovação() {
			try {
			double frequenciaFinal = ((this.frequencia/this.totalAulas)*100);
			if( frequenciaFinal < 75.0){
				throw new FrequenciaNaoAtingidaException("Reprovado por faltas");
			}
			else {
				System.out.println("Passou por frequência!");
			}
		double media = (this.nota1 + this.nota2 + this.nota3 + this.nota4)/4;
			if(media < 6) {
				throw new MediaNaoAtingidaException("Média não atingida!");
			}
			else {
				System.out.println("Aprovado");
			}
		}catch(FrequenciaNaoAtingidaException a) {
			System.out.println(a.getMessage());
		}catch(MediaNaoAtingidaException b) {
			System.out.println(b.getMessage());
		}catch (ArithmeticException e) {
			System.out.println("Não pode ser divido por zero!");
		}
		catch(Exception c){
			System.out.println("Problema Geral com as notas!");
		}
		
	}
}

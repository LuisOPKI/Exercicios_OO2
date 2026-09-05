package atividadesdeaula.aula4;

public class AgendaContatosTeste {

	public static void main(String[] args) {
		AgendaContatos agenda = new AgendaContatos();
		
		Contato c1 = new Contato("Lucas", "Ferreira", "42999998888", "Rua das Oliveiras, 120", "15/04/1998");
		Contato c2 = new Contato("Mariana", "Silva", "42988887777", "Av. Principal, 500", "22/08/2001");
		Contato c3 = new Contato("Lucas", "Almeida", "42977776666", "Rua do Bosque, 45", "10/11/1995");
		Contato c4 = new Contato("Fernanda", "Gomes", "42966665555", "Praça Central, 12", "05/01/2003");

		agenda.adicionarContatos(c1);
		agenda.adicionarContatos(c2);
		agenda.adicionarContatos(c3);
		agenda.adicionarContatos(c4);
		
		agenda.adicionarContatos(c1);

		System.out.println("-------------------------");
		agenda.listaContatos();
		
		System.out.println("-------------------------");
		agenda.acharContato("ana");
		
		System.out.println("-------------------------");
		agenda.removerContato("42988887777");
		
		System.out.println("-------------------------");
		agenda.listaContatos();
	}
}
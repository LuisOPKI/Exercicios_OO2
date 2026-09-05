package atividadesdeaula.aula3;

public class ProcessadorTeste {
		public static void main(String[] args) {
	        
	        String nomeExemplo = "Luis Otávio";
	        
	        ProcessadorNome ultimoNome = nome -> {
	            String[] partes = nome.trim().split("\\s+");
	            return partes[partes.length - 1];
	        };

	        ProcessadorNome iniciais = nome -> {
	            String[] partes = nome.trim().split("\\s+");
	            StringBuilder resultado = new StringBuilder();
	            
	            for (String parte : partes) {
	                if (parte.length() > 2) { 
	                    resultado.append(parte.toUpperCase().charAt(0)).append(".");
	                }
	            }
	            return resultado.toString();
	        };

	        String prefixo = "Sr. "; 
	        ProcessadorNome adicionarPrefixo = nome -> prefixo + nome;

	        System.out.println("Nome original: " + nomeExemplo);
	        System.out.println("-------------------------------------------------");
	        System.out.println("I. Último nome: " + ultimoNome.processar(nomeExemplo));
	        System.out.println("II. Iniciais: " + iniciais.processar(nomeExemplo));
	        System.out.println("III. Com Prefixo: " + adicionarPrefixo.processar(nomeExemplo));
	    }
}

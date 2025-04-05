public class Main {
	public static void main(String[] args){
	System.out.println("Seja bem vindo ao Filmflix"); 
	System.out.println("Filme: Aprendiz de feiticeiro");

	int anoDeLancamento = 2010; 
	System.out.println("Ano de lançamento: " + anoDeLancamento);
	
	double nota = 9.8; 	
	double media = (9.5 + 6.0 + 2.5) /3; 
	System.out.println(media); 

	// Criei essa string para a sinopse. Repare que estou usando 3 aspas após a abertura da string, assim conseguimos colocar o texto com espaço sem precisar dar /n toda hora 	
	String sinopse; 
	sinopse = """
		Filme de feiticeiro. 
		Filme badass, adoro a performance de Nicolas Cage.
		Filme irado pra cachorro! Secrets de One republic marcou minha infância. 	

		""";  

		System.out.println(sinopse); 

		String nome = "alvinho"; 
		int idade = 20; 
		double valor = 62.55; 

		System.out.println(String.format("Olá, eu sou %s, tenho %d anos e gastei pra caramba em um shopping, acho que foi por volta de %f reais", nome, idade, valor)); 

		// Exemplo claro de casting: 
		// Estamos transformando uma variável de um tipo para outro. A variável média 
		// que foi atribuído um valor double, agora foi transformada em int. 
		// MUDANÇA DE TIPO! (int, double, boolean) 	
		
		 int classificacao = (int) (media /2); 
	 	 System.out.println(classificacao); 	 
	}
}

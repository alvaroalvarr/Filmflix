public class Main {
	public static void main(String[] args){
	System.out.println("Seja bem vindo ao Filmflix"); 
	System.out.println("Filme: Aprendiz de feiticeiro");

	int anoDeLancamento = 2010; 
	System.out.println("Ano de lançamento: " + anoDeLancamento);
	
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

	}
}

import java.util.Scanner; // essas classes são chamadas de pacotes e, coletivamente, são chamadas de biblioteca de classes Java. 
			  // é uma declaração import que ajuda o compilador a localizar uma classe utilizada nesse programa.
			  // isso indica que o programa usa a classe Scanner predefinida.  

public class Leitura {
	public static void main(String[] args) {
	
	Scanner leitura = new Scanner(System.in); 
	
	System.out.println("Qual é seu filme favorito? Fala pra gente."); 

	String filmeFavorito = leitura.nextLine(); 

	
	System.out.println("Qual nota você dá para ele?"); 
	int avaliacao = leitura.nextInt();

	System.out.println("Seu filme favorito é: " + filmeFavorito + " e sua nota é " + avaliacao); 	
	} 

	leitura.close();

} 

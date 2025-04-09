import java.util.Random; 
import java.util.Scanner;  

public class Adivinhacao {
	public static void main(String[] args){
	
		int numeroSorteado = new Random().nextInt(100); 
	 	Scanner input = new Scanner(System.in); 
		System.out.println("Seja bem vindo ao jogo da adivinhação. Tente adivinhar o número entre 0 a 100. Você só poderá tentar 5 vezes.");
	
		int adivinhar = input.nextInt(); 

		int tentativas = 0; 

		for (int contador = 1; contador <= 5; contador++){
			tentativas += contador; 
			if (adivinhar == numeroSorteado) {
				break; 
			} else{
			// falta adicionar o else para esse código 		
			
			} 
			System.out.println("Parabéns, você acertou!!! O número é " + numeroSorteado + " e você acertou em " + tentativas); 	
			
		} 	
	}



}

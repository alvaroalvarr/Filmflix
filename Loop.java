import java.util.Scanner; // declara a classe importada (biblioteca Java)  

public class Loop {
	public static void main(String[] args) {

	Scanner leitura = new Scanner(System.in); // declara o scanner para que possa ser feito o input do usuário  


	double mediaAvaliacao = 0; // por convenção sempre começaremos as variáveis com o número 0  
	double nota = 0; 
	int totalDeNotas = 0; 

	// inicia o loop com a keyword for 
	// ele diz que o valor será inteiro, que será contado até 3 vezes e então encerrará o loop. o " i ++ " consta que será contado de um em um. 
		while (nota != -1) {
			System.out.println("Digite sua avaliação para o filme ou digite -1 para encerrar"); 
			nota = leitura.nextDouble(); // realiza a leitura do input feito pelo usuário 

			if (nota != -1) {
				mediaAvaliacao += nota; 
				totalDeNotas++; 
	
			}
		}	
        System.out.println("Média das avaliações " + mediaAvaliacao / totalDeNotas);  // realiza a média dos valores capturados         

	} 
	}




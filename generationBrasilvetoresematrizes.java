package pacotedeatividades;

import java.util.Scanner;

	public class generationBrasilvetoresematrizes {
// Fa�a um programa que crie um vetor por leitura com 5 valores                   
// de uma atividade e o 	
////usar um for - escreva em seguida. 
//Encontre ap�s a maior pontua��o e a apresente. 
//Mostre a posicao do maior valor
	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);

		int vetor[] = new int[5];
		int cont = 0, valMaior = 0, posiMaior = 0;
		
		
		for(cont = 0; cont < 5; cont++){
			
			System.out.println("Didite o " +(cont+1)+" valor: " );
			vetor[cont] = leia.nextInt();
			
			if(vetor[cont] >= valMaior) {
				valMaior = vetor[cont];
				posiMaior = cont+1;
			
			
			}
			
			
		}
		
		for(cont = 0; cont < 5; cont++) {
		System.out.print(vetor[cont] + " |");
		
		}
		
		System.out.print("\nSeu maior valor �: " + valMaior);
		System.out.print("\n� posi��o do maior valor �: " + posiMaior);
		
	}
	
}


package Lista5;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int aux;
		int tam;
		System.out.println("Qual tamanho?");
		tam = entrada.nextInt();
		int numeros[] = new int [tam];
		for (int x=0; x<tam;x++) {
			System.out.println("Valor");
			numeros[x] = entrada.nextInt();
		}
		for (int j=0; j<tam-1;j++) {
			
			for(int i=0;i<tam-1; i++) {
				if (numeros[i] > numeros[(i+1)]) {
					aux = numeros[i];
					numeros[i] = numeros[(i+1)];
					numeros[(i+1)] = aux;
				
			}
	
		}}
		
		for (int i=0; i<tam; i++) {
			System.out.print(numeros[i] + " || ");
			
		}
		System.out.println();
		System.out.println(numeros[0] + " é o menor");
		System.out.println(numeros[tam-1] + " é o maior");
		entrada.close();
	}}


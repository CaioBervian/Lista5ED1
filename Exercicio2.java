package Lista5;

import java.util.Scanner;

public class Exercicio2 {

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
		
		for (int i=tam-1; i>=0; i--) {
			System.out.print(numeros[i] + " || ");
		}
		entrada.close();
	}}


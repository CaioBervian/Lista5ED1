package Lista5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int aux;
		int tam;
		System.out.println("Quantos funcion�rios?");
		tam = entrada.nextInt();
		int numeros[] = new int [tam];
		String vetor[] = new String[tam];
		entrada.nextLine();
		for (int x=0; x<tam;x++) {
			System.out.println("Digite o nome");
			vetor[x] = entrada.nextLine();}
		
	Arrays.sort(vetor, new Comparator<String>() {
		@Override
		public int compare(String o1, String o2) {
			if (o1 == null && o1 == null)
				return 0;
			if (o2 == null) 
				return -1; //2
			return o1.compareTo(o2);
		}
	});
		for (int x=0; x<tam;x++) {
			System.out.println("Valor sal�rio");
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
		for (int x=0; x<tam;x++) {
			System.out.print(vetor[x] + " || ");}
			System.out.println();
		for (int i=tam-1; i>=0; i--) {
			System.out.print(numeros[i] + " || ");
		}
		entrada.close();
	}}

package Lista5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int menor, aux;
		
		int tam;
		System.out.println("Quantos alunos?");
		tam = entrada.nextInt();
		int nota1[] = new int [tam];
		int nota2[] = new int [tam];
		int media[] = new int [tam];
		String nomes[] = new String [tam];
		int i; int j;
		for (int x=0; x<tam;x++) {
			System.out.println("Nome");
			nomes[x] = entrada.next();
			entrada.nextLine();
			System.out.println("Nota 1");
			nota1[x] = entrada.nextInt();
			entrada.nextLine();
			System.out.println("Nota 2");
			nota2[x] = entrada.nextInt();
			media[x] = ((nota1[x]*2) + (nota2[x]*3))/5;
		}
		for ( i=0; i <tam -1 ; i++) {
			menor = i;
			aux = media[i];
		
			for ( j=i+1; j< tam ;j++) {
				if (media[j] < aux) {
					menor =j;
				
					aux = media[j];}}
			media[menor] = media[i];
			media[i] = aux;
			
			}
		for ( j=0; j<tam-1;j++) {
			
			for( i=0;i<tam-1; i++) {
			
			menor = i;
			aux = nota1[i];
				if (nota1[j] < aux) {
					menor =j;
					aux = nota1[j];
			nota1[menor] = nota1[i];
			nota1[i] = aux;
			}}}
		
		for ( i=0; i<tam; i++) {
			System.out.println("M�dia: " + media[i] );
		}
		for ( i=0; i<tam; i++) {
			System.out.println("Notas 1: " + nota1[i] );
		}
	
		for ( i=0; i<tam; i++) {
				Arrays.sort(nomes, new Comparator<String>() {
					@Override
					public int compare(String o1, String o2) {
						if (o1 == null && o1 == null)
							return 0;
						if (o2 == null) 
							return -1; //2
						return o1.compareTo(o2);
					}
				});}

		for ( i=0; i<tam; i++) {
			if(media[i]<7) {
		System.out.println(nomes[i] +  " reprovado" );}}
		entrada.close();
	}}


package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class SegundoExercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de números que irá inserir: ");
		int n = sc.nextInt();
		
		double vetor[] = new double[n];
		double soma, media;
		
		
		for(int i = 0; i < vetor.length; i++ ) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		
		soma = 0;
		
		System.out.print("\nVALORES = ");
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
			soma += vetor[i];
		}
		
		media = soma/n;
		
		System.out.println("\nSOMA = " + soma);
		System.out.println("MÉDIA = " + media );
		
		sc.close();
	}

}

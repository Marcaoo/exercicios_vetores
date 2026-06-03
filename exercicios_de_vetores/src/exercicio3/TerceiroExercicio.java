//Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas pessoas caso houver. 

package exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class TerceiroExercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];
		
		double somaAlturas = 0.0;
		int menores16 = 0;
		
		for(int i=0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa: ");
			
			System.out.print("Nome: ");
			nomes[i] = sc.nextLine();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
			sc.nextLine();
			
			somaAlturas += alturas[i];
			
			if(idades[i] < 16) {
				menores16++;
			}
		}
		
		double alturaMedia = somaAlturas / n;
		double porcentagem = (double) menores16 * 100.0 /n;
		
		System.out.printf("%nAltura média: %.2f%n", alturaMedia);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);
		
		for(int i = 0; i < n; i++) {
			if(idades[i] < 16) {
				System.out.println(nomes[i]);
			}
		}
		
		sc.close();

	}

}

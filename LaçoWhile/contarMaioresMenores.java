package prjLacoTpa;

import java.util.Scanner;

public class ContarMaioresMenores {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = 1;
		int maior = 0;
		int menor = 0;
		int idade;
		while (i <= 5) {
			System.out.println("Digite aqui a idade da pessoa " +i+ ":");
			idade = in.nextInt();
			
			if(idade < 18) {
				System.out.println("Menor de idade!");
				menor++;
			}else {
				System.out.println("Maior de idade!");
				maior++;
			}
			
			i++;
		}
		System.out.println("Quantidade de menores de idade: "+ menor);
		System.out.println("Quantidade de maiores de idade: "+ maior);
		
	}

}

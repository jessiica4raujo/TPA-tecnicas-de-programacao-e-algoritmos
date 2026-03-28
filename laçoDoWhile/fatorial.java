package prjTpa;
import java.util.Scanner;
public class Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int fatorial = 1;
		int n;
		System.out.println("Digite número para iniciar o fatorial:");
		n = sc.nextInt();
		
	do {
		fatorial = fatorial*i;
		i++;
	}while (i<= n);
	
	System.out.println("Fatorial de " + n +" é: ! " +fatorial);
	}
	
		
	}

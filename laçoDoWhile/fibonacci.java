import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int i = 3;
		int anterior = 1;
		int atual = 1;
		int qntTermos, futuro;
		
		System.out.println("Digite quantidade de termos desejada:");
		qntTermos = sc.nextInt();
		
		System.out.println("A série de Fibonacci é:");
		System.out.println(anterior);
		System.out.println(atual);
		
	do {
		futuro = anterior + atual;
		System.out.println(+futuro);
		
		anterior=atual;
		atual=futuro;
		i++;
		
	}while (i<= qntTermos);
	}
		

	}

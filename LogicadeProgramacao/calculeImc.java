package prjAula01;
import java.util.Scanner;

public class Calculeimc {
	public static void main (String []args) {
		Scanner ler = new Scanner (System.in);
		double peso, altura, imc;
		System.out.println ("Digite seu peso");
		peso= ler.nextDouble();
		System.out.println ("Digite sua altura");
		altura= ler.nextDouble();
		imc= peso+altura;
		System.out.println ("Seu imc é " + imc);
	}
}

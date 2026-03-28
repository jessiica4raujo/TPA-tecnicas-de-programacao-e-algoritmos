package prjAula01;
import java.util.Scanner;
public class Calculeidade {
public static void main (String []args) {
	Scanner ler= new Scanner (System.in);
	double anoatual, anonascimento, idade;
	System.out.println("Digite o ano atual");
	anoatual= ler.nextDouble();
	System.out.println ("Digite seu ano de nascimento");
	anonascimento= ler.nextDouble();
	idade=anoatual-anonascimento;
	System.out.println ("Sua idade é "  +  idade);
	}
}

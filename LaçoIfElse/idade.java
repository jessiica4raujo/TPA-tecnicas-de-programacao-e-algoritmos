package ifElse;
import java.util.Scanner;

public class Idade{
 public static void main (String []args){
    Scanner in=new Scanner(System.in);

	String pessoa1, pessoa2;
	int idade1, idade2;
	
	System.out.println("Digite o nome da 1ª pessoa:");
	pessoa1 = in.nextInt();

	System.out.println("Digite a idade da 1ª pessoa:");
	idade1 = in.nextInt();


	System.out.println("Digite o nome da 2ª pessoa:");
	pessoa2 = in.nextInt();

	System.out.println("Digite o nome da 2ª pessoa:");
	pessoa2 = in.nextInt();
	
	if(idade1 > idade2) {
	System.out.println ("Mais velha" + pessoa1 + idade1)
	System.out.println ("Mais nova" + pessoa2 + idade2)

	}else if (idade1 < idade2) {
	System.out.println ("Mais velha" + pessoa2 + idade2)
	System.out.println ("Mais nova" + pessoa1 + idade1);

	}else{ 
	System.out.println(" Ambos tem a mesma idade")
		}
	}
}

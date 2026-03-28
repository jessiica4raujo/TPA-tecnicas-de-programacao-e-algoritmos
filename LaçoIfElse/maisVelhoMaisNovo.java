package ifElse;
import java.util.Scanner;
public class programaVelhice {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		   String nome1, nome2;
	       int idade1, idade2;
	       System.out.println("Adicione aqui o nome da primeira pessoa:");
	       nome1 = in.nextLine();
	       System.out.println("Adicione aqui o nome da segunda pessoa:");
	       nome2 = in.nextLine();
	       System.out.println("Adicione aqui a idade da primeira pessoa:");
	       idade1 = in.nextInt();
	       System.out.println("Adicione aqui a idade da segunda pessoa:");
	       idade2 = in.nextInt();
	       if (idade1 > idade2) {
	           System.out.println("Pessoa mais velha: " + nome1 + " - " + idade1 + " anos");
	           System.out.println("Pessoa mais nova: " + nome2 + " - " + idade2 + " anos");
	       } else if (idade2 > idade1) {
	           System.out.println("Pessoa mais velha: " + nome2 + " - " + idade2 + " anos");
	           System.out.println("Pessoa mais nova: " + nome1 + " - " + idade1 + " anos");
	       } else {
	           System.out.println(nome1 + " e " + nome2 + " têm a mesma idade: " + idade1 + " anos");
	       }
	   }
	}

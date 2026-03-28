package numeroInteiro;
import java.util.*;
public class NumeroInteiro {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		int numeroInt;
		System.out.println("Adicione aqui o número inteiro:");
		numeroInt = ler.nextInt();
		if(numeroInt>0) {
			System.out.println ("Esse é um número POSITIVO!");
		}else if (numeroInt==0) {
			System.out.println ("Esse é um número NEUTRO!");
		}else {
			System.out.println ("Esse é um número NEGATIVO!");
		}
	}

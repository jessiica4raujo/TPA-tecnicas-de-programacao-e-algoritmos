package prjAula01;
import java.util.Scanner;
public class Salárioliquido {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner (System.in);
		double Saláriobruto, ValorINSS, valetransporte, Salárioliquido;
    
		System.out.println ("Digite o valor do Salário bruto");
		Saláriobruto= ler.nextDouble();
    
		System.out.println ("Digite o valor do INSS");
		ValorINSS= ler.nextDouble();
    
		System.out.println ("Digite o valor do vale transporte");
		valetransporte= ler.nextDouble();
    
		Salárioliquido= Saláriobruto - (ValorINSS - valetransporte);
		System.out.println ("O valor do salári líquido é de " + Salárioliquido);
				}

}

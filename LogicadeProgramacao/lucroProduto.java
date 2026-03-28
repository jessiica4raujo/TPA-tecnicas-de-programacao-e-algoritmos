package prjAula01;
import java.util.Scanner;

public class Lucroproduto {
	public static void main (String []args) {
		Scanner ler = new Scanner (System.in);

		double preçoProduto, quantidadeVendida, preçoVenda, lucro;

		System.out.println("Digite o preço do Produto ");
		preçoProduto=ler.nextDouble();

		System.out.println ("Digite a quantidade vendida");
		quantidadeVendida= ler.nextDouble();

		System.out.println("Digite o preço de venda");
		preçoVenda=ler.nextDouble ();

		lucro=(preçoVenda-preçoProduto) * quantidadeVendida;
		System.out.println ("Seu lucro é de " + lucro);
	
	}
}

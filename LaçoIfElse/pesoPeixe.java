package PesoPeixe;
import java.util.Scanner;

public class Peixe{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

	double pesoPeixe, valorTotal, taxaAdicional=8.00;
	

	System.out.println("Digite o peso em kg do peixe:");
	pesoPeixe = in.nextDouble();
	
	if (pesoPeixe<3){
	valorTotal< pesoPeixe *12 
	System.out.println("Valor total a pagar: R$ " + String.format("%.2f", valorTotal));
	}else if (pesoPeixe<5){
	valorTotal< pesoPeixe *14 
	System.out.println("Valor total a pagar: R$ " + String.format("%.2f", valorTotal));

	}else if (pesoPeixe<10){
	valorTotal< pesoPeixe *15
	System.out.println("Valor total a pagar: R$ " + String.format("%.2f", valorTotal));
	
	}else (pesoPeixe>10){
	valorTotal< (pesoPeixe *17)+R$8,00 
	System.out.println("Valor total a pagar: R$ " + String.format("%.2f", valorTotal));
	 }
        in.close();
       }
      }

package prjAula01;

public class ValoresInvertidos {
	public static void main (String args[]) {
		//declaração de variáveis
		double valorA, valorB, C;
		
		valorA=5;
		valorB=10;
		C= (C=valorA);
	    valorA= (valorA=valorB);
	    		
				System.out.println ("Os valores invertidos são"+ " " + valorA+" "+ valorB);
	}

}

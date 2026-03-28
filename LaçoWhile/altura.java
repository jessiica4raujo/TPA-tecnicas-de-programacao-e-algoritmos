package lista3;

import java.util.Scanner;

public class Altura{

	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		int i = 1;
		double joao = 1.34;
		double pedro = 1.45;
		int anos= 0;

		while (joao < pedro){
			joao+=0.025;
			pedro+=0.020;
			anos+=1;
			i++;
}

		System.out.println("João ficará mais alto que Pedro em: "+anos);
}
	}

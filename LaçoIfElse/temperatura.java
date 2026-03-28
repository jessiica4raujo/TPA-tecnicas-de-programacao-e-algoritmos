package prjtpa;
import java.util.*;
public class Temperaturas {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		double tFahrenheit, celsius;
		System.out.println("Adicione aqui a temperatura em Fahreinheit:");
		tFahrenheit = ler.nextInt();
		celsius = (tFahrenheit - 32) * 5 / 9;
		System.out.println ("A temperatura convertida em Celsius é de:" +celsius);
		if(celsius <0) {
			System.out.println ("Está FRIO EXTREMO!");
		}else if (celsius <= 10) {
			System.out.println ("Está FRIO!");
		}else if (celsius <= 20) { 
			System.out.println ("Está FRIO MODERADO!");
		}else if (celsius <= 24) {
			System.out.println ("Está um CLIMA AMENO!");
		} else {
			System.out.println("Está CALOR!");
		}
	}
}

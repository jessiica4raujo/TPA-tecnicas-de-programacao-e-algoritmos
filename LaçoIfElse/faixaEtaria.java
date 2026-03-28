package ifelse;

import java.util.Scanner;

public class FaixaEtaria {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
        int idade;
        int total = 10;

        for (int i = 1; i <= total; i++) {
            System.out.println("Digite a idade da pessoa " + i + ":");
            idade = in.nextInt();

            if (idade <= 15) {
                cont1++;
            } else if (idade <= 30) {
                cont2++;
            } else if (idade <= 45) {
                cont3++;
            } else if (idade <= 60) {
                cont4++;
            } else {
                cont5++;
            }
        }

        System.out.println("Faixa 1: " + cont1 + " pessoas - " + (cont1 * 100.0 / total) + "%");
        System.out.println("Faixa 2: " + cont2 + " pessoas - " + (cont2 * 100.0 / total) + "%");
        System.out.println("Faixa 3: " + cont3 + " pessoas - " + (cont3 * 100.0 / total) + "%");
        System.out.println("Faixa 4: " + cont4 + " pessoas - " + (cont4 * 100.0 / total) + "%");
        System.out.println("Faixa 5: " + cont5 + " pessoas - " + (cont5 * 100.0 / total) + "%");

        in.close();
    }
}

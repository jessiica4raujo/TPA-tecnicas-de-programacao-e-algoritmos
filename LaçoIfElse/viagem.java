package viagem;

import java.util.Scanner;

public class Viagem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double reais, dolares, euros, pesosArgentinos;
        String destino;

        System.out.println("Digite a quantia em dinheiro (em reais):");
        reais = in.nextDouble();

        in.nextLine();

        System.out.println("Digite o destino (nacional, europeia, norte-americano, sul-americano):");
        destino = in.nextLine().toLowerCase();

        if (destino.equals("nacional")) {
            System.out.println("Sua quantia de dinheiro em reais é de: " + reais);
        } else if (destino.equals("europeia")) {
            euros = reais * 0.16;
            System.out.println("Sua quantia de dinheiro em euros é de: " + euros);
        } else if (destino.equals("norte-americano")) {
            dolares = reais * 0.18;
            System.out.println("Sua quantia de dinheiro em dólares é de: " + dolares);
        } else if (destino.equals("sul-americano")) {
            pesosArgentinos = reais * 239.91;
            System.out.println("Sua quantia de dinheiro em pesos argentinos é de: " + pesosArgentinos);
        } else {
            System.out.println("Destino inválido!");
        }

        in.close();
    }


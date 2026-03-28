package CalcularSalario;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double salario, salarioMin, diferenca;

        System.out.println("Digite o valor do salário:");
        salario = in.nextDouble();

        System.out.println("Digite o valor do salário mínimo:");
        salarioMin = in.nextDouble();

        if (salario > salarioMin) {
            diferenca = salario - salarioMin;
            System.out.println("A pessoa recebe um valor acima do salário mínimo, diferença de: " + diferenca);
        } else if (salario < salarioMin) {
            diferenca = salarioMin - salario;
            System.out.println("A pessoa recebe um valor abaixo do salário mínimo, diferença de: " + diferenca);
        } else {
            System.out.println("A pessoa recebe um valor igual ao do salário mínimo");
        }
	  in.close();
    }
}

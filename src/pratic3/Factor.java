package pratic3;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner factorRead = new Scanner(System.in);
        System.out.println("Digite um número para descobrir o Fatorial.");
        int factor = factorRead.nextInt();
        int result = 1;

        for (int i = factor; i > 0; i--) {
           result *= i;
        }
        System.out.println("O resultado é " + result + ".");

    }
}

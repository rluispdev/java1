package pratic3;

import java.util.Scanner;

public class PairOdd {
    public static void main(String[] args) {
        Scanner numRead = new Scanner(System.in);

        while (true) {
            System.out.println("Par ou Ímpar? Digite um número:");
            int num = numRead.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " é Par!");
            } else {
                System.out.println(num + " é Ímpar!");
            }

            System.out.println("Deseja Verificar outro número? (S/N)");
            String exit = numRead.next();
            if(exit.equalsIgnoreCase("N")){
                System.out.println("Obrigado por usar meu programa!");
                break;
            }
        }
    }
}

package pratic3;

import java.util.Scanner;

public class BookOfTables {
    public static void main(String[] args) {
        Scanner  table = new Scanner(System.in);

        while(true) {
            System.out.println("Digite um número:");
            int bookTable = table.nextInt();

            for (int i = 1; i <= 10; i++) {
                int result = bookTable * i;
                System.out.println(bookTable + " * " + i + " = " + result);
            }
            System.out.println("Deseja calcular outra tabuada? (S/N)");
            String answer = table.next();
            if (answer.equalsIgnoreCase("N")){
                System.out.println("Obrigado por usar o TABCOUNT.");
                break;
            }
        }
    }
}

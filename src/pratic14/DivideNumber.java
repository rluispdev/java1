package pratic14;

import java.util.Scanner;

public class DivideNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o numerador:");
        int num1 = scanner.nextInt();

        System.out.println("Informe o denominador:");
        int num2 = scanner.nextInt();

        try {
            int result = num1 / num2;
            System.out.println("Resultado da divisão de: " + num1 + " / " + num2 + " = " + result);
        }catch (ArithmeticException e){
            System.out.println("Error divisão por zero não permitida.");
        }
    }
}

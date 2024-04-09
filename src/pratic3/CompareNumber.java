package pratic3;

import java.util.Scanner;

public class CompareNumber {
    public static void main(String[] args) {
        Scanner compare = new Scanner(System.in);
        System.out.println("Informe um número:");
        int compareNumber1 = compare.nextInt();
        System.out.println("Informe outro número:");
        int compareNumber2 = compare.nextInt();

        if (compareNumber1 == compareNumber2) {
            System.out.println("Os números são iguais!");
        } else if (compareNumber1 != compareNumber2) {
            System.out.println("Os números são diferentes");
            if (compareNumber1 > compareNumber2) {
                System.out.println("O primeiro é maior que o segundo.");
            } else {
                System.out.println("O segundo é maior que o primeiro.");
            }
        }
    }
}



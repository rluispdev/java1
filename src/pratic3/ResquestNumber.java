package pratic3;

import java.util.Scanner;

public class ResquestNumber {
    public static void main(String[] args) {

        System.out.println( "Digite um número:");
        Scanner request = new Scanner(System.in);
        int requestNumber = request.nextInt();

        if (requestNumber == 0){
            System.out.println("O número  0 não é positivo nem negativo..");
        }else if (requestNumber < 0){
            System.out.println("Esse número é negativo.");
        } else {
            System.out.println("Esse número é positivo.");
        }

    }
}

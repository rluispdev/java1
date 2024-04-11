package pratic3;

import java.util.Scanner;

public class MenuCalc {
    public static void main(String[] args) {
        Scanner numberInput = new Scanner(System.in);

        System.out.println("Vammos calcular?");

        System.out.println( """
                Escolha qual forma geométrica você deseja calcular: 
                
                 1 - Retangulo
                 2 - Circulo
                 3 - Quadrado
        """);

        int chooseUser = numberInput.nextInt();
        int menu = chooseUser;
        int exit = 0;


while (true) {
    switch (menu) {
        case 1:
            System.out.println("Informe a base:");
            int b = numberInput.nextInt();
            System.out.println("Informe a altura:");
            int h = numberInput.nextInt();
            int rectangle = b * h;
            System.out.println("O perímetro do retângulo é: " + rectangle);
            break;

        case 2:
            double Pi = 3.14;
            System.out.println("Informe o raio:");
            int raio = numberInput.nextInt();
            int r = raio * raio;
            int circle = (int) (Pi * r);
            System.out.println("A área do círculo é : " + circle);
            break;

        case 3:
            System.out.println("Informe um lado:");
            int l = numberInput.nextInt();
            int quadrado = l * l;
            System.out.println("A área do quadrado é: " + quadrado);
            break;

        default:
            System.out.println("Não temos essa opção!");
            break;
    }
    System.out.println("Deseja continuar (S/N)");
    String answer = numberInput.next();
    if (answer.equalsIgnoreCase("N")){
        System.out.println("Obrigado por utilizar o CalcGeo! Até mais!!!");
        break;
    }
}
        }
}

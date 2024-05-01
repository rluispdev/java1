package pratic14.Password;

import java.util.Scanner;

public class ShowPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua senha: ");
        String password = scanner.nextLine();

        try {
            validPassword(password);
                System.out.println("Senha Válida. Acesso permitido.");
        }catch(ShowPasswordInvalidException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
    private static void validPassword(String password) {
        if( password.length() <8){
            throw new ShowPasswordInvalidException("A senha deve conter ao menos 8 caracteres");
        }
    }
}

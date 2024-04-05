public class ComparacaoDeStrings {
    String password = "123453";

    //Método de classe.
    public static void main(String[] args) {
        ComparacaoDeStrings compararison = new ComparacaoDeStrings();
       compararison.verfierPassword();
    }
    //Método
    public void verfierPassword() {
        if (password.equals("12345")) {
            System.out.println("Acesso autorizado.");
        } else {
            System.out.println("Senha incorreta.");
        }
    }
}

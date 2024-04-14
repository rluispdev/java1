package pratic5;

public class MainP5 {
    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount();
        myAccount.titular = "Rafael Gonzaga";
        myAccount.setNumberAccount(87965);
        myAccount.setBalance(87600.34);

        System.out.println("Número da Conta: "+ myAccount.getNumberAccount());
        System.out.println("Saldo disponvel: R$ " + myAccount.getBalance());


    }
}

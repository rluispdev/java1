package pratic6;

import java.util.Scanner;

public class BankAccount {

    protected  double balance;

public void deposit(double money){
        balance += money;
    System.out.println(("Foram depositados R$ " +  money  + "  na sua conta"));
}
   public void whithdraw(double withDrawMoney){
        if (withDrawMoney > balance){
            System.out.println("Então você tem R$ " + balance + " na conta e tá tentando sacar R$ " + withDrawMoney +", fica dificil ne?");
        } else if (withDrawMoney < balance){
            balance -= withDrawMoney;
            System.out.println("Saque: " + withDrawMoney );
            System.out.println( "Você sacou R$ " + withDrawMoney + ", ainda tem " + balance + " na sua conta.");
        } else if (withDrawMoney == balance){
            System.out.println("Saque: " + balance );
            balance -= withDrawMoney;
            System.out.println("  Você acabou de sacar todo seu o dinheiro saldo atual R$ " + balance);
        }
    }

    public void myBalance() {
        System.out.println("Seu saldo é: " +  balance);
    }
}







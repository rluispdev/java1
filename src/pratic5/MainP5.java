package pratic5;

public class MainP5 {
    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount();
        myAccount.titular = "Rafael Gonzaga";
        myAccount.setNumberAccount(87965);
        myAccount.setBalance(87600.34);

        System.out.println("Número da Conta: "+ myAccount.getNumberAccount());
        System.out.println("Saldo disponvel: R$ " + myAccount.getBalance());

        AgePeople agePeople = new AgePeople();
        agePeople.setName("Neymar");
        agePeople.setAge(17);


        Product product = new Product();
        product.setName("Iphone");
        product.setPrice(4500.69);

        System.out.println("Este " + product.getName() + " Custa " +  product.getPrice() + " sem desconto.");
        product.aplicateDiscount(20);
        System.out.println("Preço com desconto é " + product.getPrice() );






    }
}

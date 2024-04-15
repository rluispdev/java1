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


        Student student1 = new Student("Rafael", 7.8, 9.0, 10);
        Student student2 = new Student("Neymar", 6.7, 4.3, 7.3);

        System.out.println("Aluno: " + student1.getName());
        System.out.println("Notas: " + student1.getGrade1() + " , " + student1.getGrade2() + " , " + student1.getGrade3() );
        System.out.println("Media: " + student1.returnMedia());











    }
}

package pratic6;

import pratic6.Animals.Cat;
import pratic6.Animals.Dog;
import pratic6.Bank.CurrentAccount;
import pratic6.Car.ModelCar;
import pratic6.Number_Prime.CheckPrimeNumber;
import pratic6.Number_Prime.GetNextPrime;
import pratic6.Number_Prime.NumberPrime;

public class MainP6 {

    public static void main(String[] args) {
        ModelCar modelCar = new ModelCar();
        modelCar.setFabactory("Volks");
        modelCar.factory();
        modelCar.setModel("Fusca");
        modelCar.setPriceYear1(3400.45);
        modelCar.setPriceYear2(5900.90);
        modelCar.setPriceYear3(2800.20);
        modelCar.calcMedia(3);
        modelCar.showInformation();
        System.out.println("-----------------------------");
        ModelCar modelCar2 = new ModelCar();
        modelCar2.setFabactory("Fiat");
        modelCar2.factory();
        modelCar2.setModel("Elba");
        modelCar2.setPriceYear1(3900.15);
        modelCar2.setPriceYear2(4900.72);
        modelCar2.setPriceYear3(6800.25);
        modelCar2.calcMedia(3);
        modelCar2.showInformation();

        Cat cat = new Cat();
        cat.shakeAssCat();

        Dog dog = new Dog();
        dog.shakeAss();

        System.out.println("Banco ____________________________");

        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.deposit(1000);
        currentAccount.myBalance();
        currentAccount.whithdraw(345.50);
        currentAccount.whithdraw(100);
        currentAccount.deposit(400.30);
        currentAccount.myBalance();
        currentAccount.whithdraw(1000);
        currentAccount.ourTariff();
        currentAccount.myBalance();
        currentAccount.whithdraw(908.9);
        currentAccount.whithdraw(4);
        currentAccount.myBalance();
        currentAccount.myBalance();
        currentAccount.deposit(40);
        currentAccount.whithdraw(50);

        CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();
        checkPrimeNumber.checkPrimerNumber(4);
        checkPrimeNumber.checkPrimerNumber(2);
        checkPrimeNumber.checkPrimerNumber(456);

        GetNextPrime getPrime = new GetNextPrime();
        int nextPrime = getPrime.getNextPrime(92);
        System.out.println("O proximo prime depois de 92 é: " + nextPrime);

        NumberPrime primeList = new NumberPrime();
        primeList.listPrimes(20);

    }
}



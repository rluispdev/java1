package pratic6.Number_Prime;

public class NumberPrime {

    public boolean checkPrimeMethod(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void listPrimes(int limitSuper){
        System.out.println("Números primos até " + limitSuper + ": ");
        for(int i = 2; i <= limitSuper; i ++){
            if (checkPrimeMethod(i)){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}



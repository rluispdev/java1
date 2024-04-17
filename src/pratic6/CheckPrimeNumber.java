package pratic6;

public class CheckPrimeNumber extends NumberPrime {

    public void checkPrimerNumber(int number){
        if(checkPrimeMethod(number)){
            System.out.println( number + " is prime");
        } else{
            System.out.println( number + " not prime");
        }
    }
}

package pratic6;

public class GetNextPrime extends NumberPrime {
    public int getNextPrime( int lastPrime){
        int nextNumber = lastPrime + 1;
        while (!checkPrimeMethod(nextNumber)){
            nextNumber++;
        }
        return  nextNumber;
    }
}

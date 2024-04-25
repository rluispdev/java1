package pratic11;

public class ListNumInt implements Comparable <ListNumInt> {

    private  int num;

    public ListNumInt(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return String.valueOf((int) num);
    }

    @Override
    public int compareTo(ListNumInt otherNum) {
        return this.num - otherNum.num;
    }
}

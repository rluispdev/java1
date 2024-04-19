package pratic7.ConverterCurrency.BookTable;

public class BookTable implements Table {
    @Override
    public String getShowTable(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            System.out.println();
            sb.append(n + " x " + i + " = " + result + "\n");
        }
        return sb.toString();
    }
}


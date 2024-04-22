package pratic7.ConverterCurrency.Marketable;

public class Service implements  Marketable{
    @Override
    public double getPrice(int quant, int tariff, double price) {
       
        double myPrice = quant * price;
        double serviceProduct =  myPrice +   tariff;

        System.out.println(String.format(" %d  serviços são R$ %.2f mais a tarifa de R$ %d  fica no total de R$ %.2f" , quant, myPrice, tariff, serviceProduct ));
        return serviceProduct ;
    }
}

package pratic6.Bank;

public class CurrentAccount extends BankAccount {
    double tariff = 45.90;

    public void ourTariff() {
        balance -= tariff;
        System.out.println(String.format("Tarifa mensal de R$: " + tariff + " cobrada com sucesso! O seu saldo atual é R$: " + balance));
    }
}

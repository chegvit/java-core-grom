package lesson22.homework22;

public class Utils {

    private static String[] cities = {"Kiev", "Odessa"};

    public int getLimitTransactionsPerDayCount() {
        return 10;
    }

    public int getLimitTransactionsPerDayAmount() {
        return 100;
    }

    public int getLimitSimpleTransactionAmount() {
        return 40;
    }

    public String[] getCities() {
        return cities;
    }
}

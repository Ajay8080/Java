public class Main {
    public static void main(String[] args) {
        Dollar d1 = new Dollar("USA", 100);
        Dollar d2 = new Dollar("USA", 100);
        System.out.println(d1.equals(d2));
        Currency currency = new Currency("USA");
        Dollar dollar = new Dollar("USA", 100.0);
        System.out.println(currency.equals(dollar));

    }
}

public class Main {
    public static void main(String[] args) {
        int price = 10_000; // цена билета
        int amount = 20; // кол-во рублей для 1 бонусной мили

        int bonus = price / amount;

        System.out.println(bonus);
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    }
    static String takeInitial(){
        System.out.println("Выберете валюту которую хотите конвертировать: ");
        System.out.println("RUB");
        System.out.println("USD");
        System.out.println("EUR");
        Scanner initialMoney = new Scanner(System.in);
        return initialMoney. next();

    }
    static String takeExchange(){
        System.out.println("Выберете на какую валюту вы хотите конвертировать: ");
        System.out.println("RUB");
        System.out.println("USD");
        System.out.println("EUR");
        Scanner ExchangeMoney = new Scanner(System.in);
        return ExchangeMoney.next();

    }
    static double getAmount(){
        System.out.println("Введите сумму которую вы хотите конвертировать: ");
        Scanner amountMoney = new Scanner(System.in);
        return amountMoney.nextDouble();
    }
    static double convert(String takeInitial, String takeExchange, double getAmount){

        return 0;
    }
}
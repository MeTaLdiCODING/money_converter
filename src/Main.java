import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
convert(takeInitial(),takeExchange(),getAmount());
    }
    static String takeInitial(){
        System.out.println("Выберете валюту которую хотите конвертировать: ");
        System.out.println("RUB");
        System.out.println("USD");
        System.out.println("EUR");
        Scanner initialMoney = new Scanner(System.in);
        return initialMoney. next().toUpperCase();

    }
    static String takeExchange(){
        System.out.println("Выберете на какую валюту вы хотите конвертировать: ");
        System.out.println("RUB");
        System.out.println("USD");
        System.out.println("EUR");
        Scanner ExchangeMoney = new Scanner(System.in);
        return ExchangeMoney.next().toUpperCase();

    }
    static double getAmount(){
        System.out.println("Введите сумму которую вы хотите конвертировать: ");
        Scanner amountMoney = new Scanner(System.in);
        return amountMoney.nextDouble();
    }
    static void convert(String takeInitial, String takeExchange, double getAmount){


if(takeInitial.equals("RUB")){
    if(takeExchange.equals("USD")){
    System.out.println("Ваша сумма в USD: " + getAmount* 0.012654);
    }
    else if(takeExchange.equals("EUR")){
    System.out.println("Ваша сумма в EUR: "+getAmount* 0.011042);
    }
    else{
        System.out.println("Введено некоректное значение!");
    }
}
        if(takeInitial.equals("USD")){
            if(takeExchange.equals("RUB")){
                System.out.println("Ваша сумма в RUB: " + getAmount* 79.02);
            }
            else if(takeExchange.equals("EUR")){
                System.out.println("Ваша сумма в EUR: "+getAmount* 0.8685);
            }
            else{
                System.out.println("Введено некоректное значение!");
            }
        }
        if(takeInitial.equals("EUR")){
            if(takeExchange.equals("USD")){
                System.out.println("Ваша сумма в USD: " + getAmount* 1.15);
            }
            else if(takeExchange.equals("RUB")){
                System.out.println("Ваша сумма в RUB: "+getAmount* 90.56);
            }
            else{
                System.out.println("Введено некоректное значение!");
            }
        }


    }
}
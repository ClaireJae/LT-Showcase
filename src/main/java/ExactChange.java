import java.util.Scanner;

public class ExactChange {

    static final int[] bills = {100, 50, 20, 10, 5, 1};
    static final double[] coins = {.25, .10, .05, .01};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter any amount of money: ");

        double user_amt = scanner.nextDouble();
        if (user_amt < 0) {
            System.out.println("Invalid! Amount must be greater than or equal to zero.");
        }
        currencyAmount(user_amt);
    }

    public static void currencyAmount(double user_amt) {
        for (int bill : bills) {
            int billAmt = (int) (user_amt / bill);

            if (billAmt > 0) {
                System.out.println(billAmt + " - $" + bill + ".");
                user_amt -= billAmt * bill;
            }
        }
        for (double coin : coins) {
            int coinAmt = (int) (user_amt / coin);

            if (coinAmt > 0) {
                System.out.println(coinAmt + " - " + translateCoin(coin) + ".");
                user_amt -= coinAmt * coin;
            }
        }
    }

    public static String translateCoin(double coin) {
        if (coin == .25){
            return "quarters";
        } else if (coin == .10){
            return "dimes";
        } else if (coin == .05) {
            return "nickels";
        }else{
            return "pennies";
        }
    }
}

import java.text.DecimalFormat;

public class Test {
    public static void main(String[] args) {
        DecimalFormat pricePattern = new DecimalFormat("$0.00");

        double price1 = 78.66666666;
        double price2 = 34.5;
        double price3 = .3333333;
        int price4 = 3;
        double price5 = 100.23;

        System.out.println("The First price is: " + pricePattern.format(price1));
        System.out.println("The second price is: " + pricePattern.format(price2));
        System.out.println("The third price is: " + pricePattern.format(price3));
        System.out.println("The fourth price is: " + pricePattern.format(price4));
        System.out.println("The fifth price is: " + pricePattern.format(price5));
    }
}
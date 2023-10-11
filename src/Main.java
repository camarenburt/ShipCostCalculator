import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double item;
    double tax;
    double finalPrice;

        System.out.println("What is the price of your item? ");
        item = scan.nextDouble();

        if(item>=100){
                System.out.println("Your final price is "+ item +".");
            }else{
                tax = item * 0.02;
                finalPrice = item + tax;
                System.out.println("Your final price is "+ finalPrice +".");
        }
    }
}
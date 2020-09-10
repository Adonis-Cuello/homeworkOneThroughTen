import java.util.Scanner;
public class numberTwo {
    public static void main(String[] args) {
        //getting user price
        Scanner myPrice = new Scanner(System.in);
        System.out.println("Enter Price");

        int enteredPrice = myPrice.nextInt();
        System.out.println("Price is : "+ enteredPrice);

        //getting user disscount
        Scanner myDiscount = new Scanner(System.in);
        System.out.println("Enter Discount");

        Double enteredDiscount = myDiscount.nextDouble();
        System.out.println("Discount is :"+ enteredDiscount);
        //getting final price
        Object finalPrice = enteredPrice * enteredDiscount;
        System.out.println("Final Price is: " + finalPrice);

                


    }

}

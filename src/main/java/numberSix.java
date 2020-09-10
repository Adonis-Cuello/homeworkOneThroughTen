import java.util.Scanner;

        //Create a program that scans for a student's number grade number prints a student's letter grade based on the following conditions:
        //if a student's grade is between 90 and 100 then print you got an A
        //if a student's grade is between 89 and 80 then print you got a B
        //if a student's grade is between 79 and 70 then print you got a C
        //if a student's grade is between 69 and 60 then print you got an D
        //if a student's grade is  59 and below then print you got an F

public class numberSix {

    public static void main(String[] args) {
        Scanner myGrade = new Scanner(System.in);
        System.out.println("Enter Grade");

        String userGrade = myGrade.nextLine();
        System.out.println("Your Grade is:" + userGrade);

        int x = myGrade.nextInt();
        if (x > 90 && x < 100) {
            System.out.println("You got an A");


        }
        if (x > 80 && x < 89){
        System.out.println("You got a B");
    }
        if (x > 70 && x < 79){
            System.out.println("You got a C");

        }
        if (x > 60 && x < 69){
            System.out.println("You got a D");
        }
        if (x < 59){

        }
    }

}

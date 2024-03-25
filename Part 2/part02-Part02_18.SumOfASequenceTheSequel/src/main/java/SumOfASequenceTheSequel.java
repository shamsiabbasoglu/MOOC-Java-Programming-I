
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Implement a program which calculates
        //the sum of a closed interval, and prints it.
        //Expect the user to write the smaller number
        //first and then the larger number.
        //
        //You can base your solution to this
        //exercise to the solution of last exercise —
        //add the functionality for the user
        //to enter the starting point as well.

        System.out.println("First number?");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int num2 = Integer.valueOf(scanner.nextLine());

        int sum = 0;
        for (int i = num1; i <= num2 ; i++) {
            sum += i;
        }
        System.out.println("The sum is: " + sum);
    }
}

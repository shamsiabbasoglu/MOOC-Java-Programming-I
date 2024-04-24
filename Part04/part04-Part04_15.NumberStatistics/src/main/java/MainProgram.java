
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        Statistics statisticsAll = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics statisticsOdd = new Statistics();

        System.out.println("Enter numbers:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            statisticsAll.addNumber(input);
            if (input % 2 == 0) {
                statisticsEven.addNumber(input);
            } else {
                statisticsOdd.addNumber(input);
            }
        }
        System.out.print("Sum: " + statisticsAll.sum());
        System.out.print("\nSum of even numbers: " + statisticsEven.sum());
        System.out.print("\nSum of odd numbers: " + statisticsOdd.sum());

//        System.out.println("Count: " + statistics.getCount());
//        System.out.println("Sum: " + statistics.sum());
//        System.out.println("Average: " + statistics.average());
    }
}


import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int summary = 0;
        int numbers = 0;

        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            }
            numbers++;
            summary += input;
        }
        if (numbers > 0) {
            System.out.println("Average of the numbers: " + (1.0 * summary / numbers));
        }
    }
}

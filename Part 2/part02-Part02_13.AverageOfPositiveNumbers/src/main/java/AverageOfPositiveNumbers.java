
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int summary = 0;
        int numbers = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            }

            if (input > 0) {
                numbers++;
                summary += input;
            }
        }
        if (numbers == 0) {
            System.out.println("Cannot calculate the average");
        }
        System.out.println(1.0 * summary / numbers);

    }
}

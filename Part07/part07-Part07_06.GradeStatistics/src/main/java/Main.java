
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here -- consider breaking the program into 
        // multiple classes.
        GradeDistribution distribution = new GradeDistribution();
        System.out.println("Enter point totals, -1 stops: ");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            distribution.add(input);
        }
        distribution.print();
    }
}

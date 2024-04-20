
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        while (true) {
            String input = scanner.nextLine();
            
            if (input.isEmpty()) {
                break;
            }
            
            String[] parts = input.split(",");
            if (max < Integer.valueOf(parts[1])) {
                max = Integer.valueOf(parts[1]);
            }
        }
        System.out.println("Age of the oldest: " + max);
    }
}

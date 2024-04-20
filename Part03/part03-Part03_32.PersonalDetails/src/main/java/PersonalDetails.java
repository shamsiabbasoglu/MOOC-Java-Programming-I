
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";
        double sum = 0;
        int numberOfIndex = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            String[] parts = input.split(",");
            if (name.length() < parts[0].length()) {
                name = parts[0];
            }
            sum += Integer.valueOf(parts[1]);
            numberOfIndex++;
        }
        System.out.println("Longest name: " + name);
        double average = sum / numberOfIndex;
        System.out.println("Average of the birth years: " + average);
    }
}

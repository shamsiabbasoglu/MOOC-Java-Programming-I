
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";
        int max = 0;
        while (true) {
            String input = scanner.nextLine();
            
            if (input.isEmpty()) {
                break;
            }
            
            String[] parts = input.split(",");
            int age = Integer.valueOf(parts[1]);
            if (max < age) {
                max = age;
                name = parts[0];
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}

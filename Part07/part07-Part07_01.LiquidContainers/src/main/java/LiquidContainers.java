
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        int maxValue = 100;
        int minValue = 0;

        while (true) {
            System.out.println("First: " + first + "/" + maxValue);
            System.out.println("Second: " + second + "/" + maxValue);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if (amount < 0) {
                amount = minValue;
            }
            if (amount > 100) {
                amount = maxValue;
            }

            switch (command) {
                case "add":
                    if ((first + amount) > 100) {
                        first = maxValue;
                    } else {
                        first += amount;
                    }
                    break;
                case "move":
                    if ((first - amount) < 0) {
                        if ((second + first) > 100) {
                            second = maxValue;
                        } else {
                            second += first;
                        }
                        first = minValue;
                    } else {
                        first -= amount;
                        if ((second + amount) > 100) {
                            second = maxValue;
                        } else {
                            second += amount;
                        }
                    }
                    break;
                case "remove":
                    if ((second - amount) < 0) {
                        second = minValue;
                    } else {
                        second -= amount;
                    }
                    break;
            }
        }
    }

}

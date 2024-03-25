
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        //Part 1
//        System.out.println("Where to?");
//        int input = Integer.valueOf(scanner.nextLine());
//
//        for (int i = 1; i <= input; i++) {
//            System.out.println(i);
//        }

        //Part 2
        System.out.println("Where to?");
        int end = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int start = Integer.valueOf(scanner.nextLine());

        if (start <= end) {
            for (int i = start; i <= end ; i++) {
                System.out.println(i);
            }
        }
    }
}

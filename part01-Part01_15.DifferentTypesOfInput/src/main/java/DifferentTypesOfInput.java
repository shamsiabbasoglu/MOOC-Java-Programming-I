
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String string1 = scan.nextLine();
        System.out.println("Give an integer:");
        int string2 = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double string3 = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean string4 = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + string1);
        System.out.println("You gave the integer " + string2);
        System.out.println("You gave the double " + string3);
        System.out.println("You gave the boolean " + string4);
    }
}

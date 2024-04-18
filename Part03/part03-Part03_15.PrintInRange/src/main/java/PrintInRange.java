
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(list, 0, 5);
        
        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRange(list, 3, 10);
        
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for(int number: numbers) {
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
    }
}

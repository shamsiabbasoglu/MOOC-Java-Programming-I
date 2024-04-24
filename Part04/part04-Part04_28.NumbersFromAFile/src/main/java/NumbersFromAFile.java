
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        ArrayList<Integer> list = new ArrayList<>();
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                list.add(Integer.valueOf(fileReader.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

        int count = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            if (list.contains(i)) {
                count++;
            }
        }
        
        System.out.print("Numbers: " + count);
    }
}

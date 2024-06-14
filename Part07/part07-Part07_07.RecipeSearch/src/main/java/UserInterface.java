
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner = new Scanner(System.in);
    private FileReader reader = new FileReader();

    public void start() {
        System.out.println("File to read: ");
        String input = scanner.nextLine();
        reader.read(input);

        System.out.println("\nCommands:"
                + "\nlist - list the recipes"
                + "\nstop - stops the program"
                + "\nfind name - searches recipes by name"
                + "\nfind cooking time - searches recipes by cooking time"
                + "\nfind ingredient - searches recipes by ingredient");
        while (true) {
            System.out.println("\nEnter Command: ");
            String command = scanner.nextLine();

            switch (command) {
                case "list":
                    reader.list();
                    break;
                case "find name":
                    System.out.println("Searched word: ");
                    reader.findByName(scanner.nextLine());
                    break;
                case "find cooking time":
                    System.out.println("Max cooking time: ");
                    reader.findByMaxDuration(Integer.parseInt(scanner.nextLine()));
                    break;
                case "find ingredient":
                    System.out.println("Ingredient: ");
                    reader.findByIngredient(scanner.nextLine());
                    break;
                case "stop":
                    return;
                default:
                    System.out.println("Invalid command.");
                    break;
            }
        }
    }
}

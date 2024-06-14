
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        List<Bird> birds = new ArrayList<>();

        while (true) {
            System.out.println("?");
            String command = scan.nextLine().trim().toLowerCase();
            switch (command) {
                case "add":
                    addBird(scan, birds);
                    break;
                case "observation":
                    observeBird(scan, birds);
                    break;
                case "all":
                    printAllBirds(birds);
                    break;
                case "one":
                    printOneBird(scan, birds);
                    break;
                case "quit":
                    return;
                default:
                    System.out.println("Unknown command!");
            }
        }
    }

    private static void addBird(Scanner scan, List<Bird> birds) {
        System.out.println("Name: ");
        String name = scan.nextLine();
        System.out.println("Name in Latin: ");
        String nameInLatin = scan.nextLine();
        birds.add(new Bird(name, nameInLatin));
    }

    private static void observeBird(Scanner scan, List<Bird> birds) {
        System.out.println("Bird? ");
        String name = scan.nextLine();
        Optional<Bird> bird = birds.stream()
                .filter(b -> b.getName().equalsIgnoreCase(name))
                .findFirst();

        if (bird.isPresent()) {
            bird.get().observe();
        } else {
            System.out.println("Not a bird!");
        }
    }

    private static void printAllBirds(List<Bird> birds) {
        birds.forEach(System.out::println);
    }

    private static void printOneBird(Scanner scan, List<Bird> birds) {
        System.out.println("Bird? ");
        String name = scan.nextLine();
        birds.stream()
                .filter(bird -> bird.getName().equalsIgnoreCase(name))
                .forEach(System.out::println);
    }
}

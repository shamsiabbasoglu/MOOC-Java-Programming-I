
import java.util.Scanner;

public class UserInterface {

    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("stop")) {
                break;
            }
            process(command);
        }
    }

    public void process(String command) {
        if (command.equalsIgnoreCase("add")) {
            add();
        } else if (command.equalsIgnoreCase("list")) {
            list();
        } else if (command.equalsIgnoreCase("remove")) {
            remove();
        }
    }

    public void add() {
        System.out.print("To add: ");
        String task = scanner.nextLine();
        list.add(task);
    }
    
    public void remove() {
        System.out.print("Which one is removed? ");
        int index = scanner.nextInt();
        list.remove(index);
    }
    
    public void list() {
        list.print();
    }
}

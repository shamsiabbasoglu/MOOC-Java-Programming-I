
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> strings = new ArrayList<>();
        
        removeLast(strings);
    }

    public static void removeLast(ArrayList<String> strings) {
        if(strings.isEmpty()) {
            return;
        }
        strings.remove(strings.size() - 1);
    }
}

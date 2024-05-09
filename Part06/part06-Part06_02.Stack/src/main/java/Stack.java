
import java.util.ArrayList;

public class Stack {

    private ArrayList<String> things;

    public Stack() {
        this.things = new ArrayList<>();
    }

    public boolean isEmpty() {
        return things.isEmpty();
    }

    public void add(String value) {
        things.add(value);
    }

    public ArrayList<String> values() {
        return things;
    }

    public String take() {
        return things.remove(things.size() - 1);
    }
}

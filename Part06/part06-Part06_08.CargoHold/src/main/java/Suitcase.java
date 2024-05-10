
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if ((totalWeight() + item.getWeight()) <= maximumWeight) {
            items.add(item);
        }
    }

    @Override
    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }        
        if (items.size() == 1) {
            return "1 item (" + totalWeight() + " kg)";
        }
        return items.size() + " items (" + totalWeight() + " kg)";
    }
    
    public void printItems() {
        for(Item item : items) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        int total = 0;
        for (Item item : items) {
            total += item.getWeight();
        }
        return total;
    }
    
    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        Item heaviest = items.get(0);
        for (Item item : items) {
            if (heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }
}


import java.util.ArrayList;

public class Hold {

    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if ((totalWeight() + suitcase.totalWeight()) <= maximumWeight) {
            suitcases.add(suitcase);
        }
    }

    public int totalWeight() {
        int total = 0;
        for (Suitcase suitcase : suitcases) {
            total += suitcase.totalWeight();
        }
        return total;
    }
    
    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }

    @Override
    public String toString() {
        return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }
}


import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gifts;

    public Package() {
        gifts = new ArrayList<>();
    }
    
    public void addGift(Gift gift) {
        gifts.add(gift);
    }
    
    public int totalWeight() {
        int sum = 0;
        for (Gift gift : gifts) {
            sum += gift.getWeight();
        }
        return sum;
    }
}

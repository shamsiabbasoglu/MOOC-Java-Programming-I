
public class Container {

    private int container;

    public Container() {
        this.container = 0;
    }

    public int contains() {
        return container;
    }

    public void add(int amount) {
        if (amount < 0) {
            amount = 0;
        }
        if ((container + amount) > 100) {
            container = 100;
        } else {
            container += amount;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            amount = 0;
        }
        if (amount > container) {
            container = 0;
        } else {
            container -= amount;
        }
    }

    @Override
    public String toString() {
        return contains() + "/100";
    }
}


public class Statistics {

    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        sum += number;
        count++;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        if (count != 0) {
            return sum;
        }
        return 0;
    }

    public double average() {
        if (count != 0) {
            return 1.0 * sum / count;
        }
        return 0;
    }
}

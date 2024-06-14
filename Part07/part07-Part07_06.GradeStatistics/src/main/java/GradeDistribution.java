
import java.util.ArrayList;

public class GradeDistribution {

    private ArrayList<Integer> points;

    public GradeDistribution() {
        this.points = new ArrayList<>();
    }

    public void add(int input) {
        if (input < 0 || input > 100) {
            return;
        }
        points.add(input);
    }

    public void print() {
        double sum = 0;
        double passingSum = 0;
        int numberOfPassing = 0;

        for (Integer point : points) {
            sum += point;

            if (point >= 50) {
                passingSum += point;
                numberOfPassing++;
            }
        }

        System.out.println("Point average (all): " + sum / points.size());
        if (numberOfPassing > 0) {
            System.out.println("Point average (passing): " + passingSum / numberOfPassing);
        } else {
            System.out.println("Point average (passing): -");
        }
        System.out.println("Pass percentage: " + (100.0 * numberOfPassing / points.size()));
        System.out.println("Grade distribution:");
        System.out.println(printStars());
    }

    public String printStars() {
        int number5 = 0;
        int number4 = 0;
        int number3 = 0;
        int number2 = 0;
        int number1 = 0;
        int number0 = 0;
        String star = "*";
        for (Integer point : points) {
            if (point >= 90) {
                number5++;
            }
            if (point >= 80 && point < 90) {
                number4++;
            }
            if (point >= 70 && point < 80) {
                number3++;
            }
            if (point >= 60 && point < 70) {
                number2++;
            }
            if (point >= 50 && point < 60) {
                number1++;
            }
            if (point >= 0 && point < 50) {
                number0++;
            }
        }
        return "\n5: " + star.repeat(number5)
                + "\n4: " + star.repeat(number4)
                + "\n3: " + star.repeat(number3)
                + "\n2: " + star.repeat(number2)
                + "\n1: " + star.repeat(number1)
                + "\n0: " + star.repeat(number0);
    }
}


public class PaymentCard {

    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public void eatAffordably() {
        if (balance >= 2.6) {
            this.balance -= 2.6;
        }
    }

    public void eatHeartily() {
        if (balance >= 4.6) {
            this.balance -= 4.6;
        }
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            if (balance + amount >= 150) {
                balance = balance + (150 - balance);
            } else {
                balance += amount;
            }
        }
    }

    @Override
    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }
}

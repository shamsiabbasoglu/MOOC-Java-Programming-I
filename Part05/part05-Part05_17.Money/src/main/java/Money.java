
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition) {
        int euros = this.euros + addition.euros();
        int cents = this.cents + addition.cents();
        if (cents > 99) {
            cents -= 100;
            euros++;
        }
        return new Money(euros, cents);
    }
    
    public Money minus(Money decreaser) {
        int euros = this.euros - decreaser.euros();
        int cents = this.cents - decreaser.cents();
        if (cents < 0) {
            cents += 100;
            euros--;
        }
        if (euros < 0) {
            return new Money (0, 0);
        }
        return new Money(euros, cents);
    }
    
    public boolean lessThan(Money compared) {
        if (euros < compared.euros()) {
            return true;
        }
        if (euros > compared.euros()) {
            return false;
        }
        return cents < compared.cents();
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
}

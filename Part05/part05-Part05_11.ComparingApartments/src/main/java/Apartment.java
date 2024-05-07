
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;
    private int totalPrice;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
        this.totalPrice = this.squares * this.pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }
    
    public int priceDifference(Apartment compared) {
        return Math.abs(this.totalPrice - compared.totalPrice);
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        return (this.totalPrice - compared.totalPrice) > 0;
    }
}

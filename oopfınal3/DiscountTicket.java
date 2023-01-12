
package oopfınal3;

public class DiscountTicket extends StandartTicket {
    final double discount;

    public DiscountTicket(int seatNumber, int number, double discount) {
        super(seatNumber, number);
        this.discount=discount;
    }
   
    public void print(){
        
    }
    @Override
    public double computePrice(){
        return price-price*discount;
    }
}

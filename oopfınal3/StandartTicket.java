package oopfınal3;

public class StandartTicket extends Ticket{

    final double price;
    public StandartTicket(int seatNumber, int number) {
        super(seatNumber, number);
        this.price = 10;
    }
  
   public void print(){
   }
    @Override
    public double computePrice() {
        return price;
    }
    
}

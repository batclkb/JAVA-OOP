
package oopfınal3;

public abstract class Ticket {
    public int number;
    private int seatNumber;
    Ticket(int seatNumber,int number){
        this.number=number;
        this.seatNumber=seatNumber;
    }
    public void print(){
        System.out.println("Seat: "+this.seatNumber+" Number: "+this.number+" Price: "+computePrice());
    }
    
    public abstract double computePrice();
    
}


package oopfınal3;

import java.util.List;

public class TicketSeller {
    List<Ticket> tickets;
    private double incomes;
    public TicketSeller(List<Ticket> tickets){
        this.tickets=tickets;
    }
    public void Sell(Ticket t){
        incomes+=t.computePrice();
    }
    public double getincomes(){
        return incomes;
    }
}

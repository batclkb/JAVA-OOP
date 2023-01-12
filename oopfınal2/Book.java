
package oopfınal2;


class Book implements Comparable<Book> {
    public String name;
    public int price;
    Book(String n, int p){
        this.name=n;
        this.price=p;
    }
    public double totalPrice(){
        return this.price+this.price*8/100;
    }

    @Override
    public int compareTo(Book t) {
        return price-t.price;
    }
  
   
}

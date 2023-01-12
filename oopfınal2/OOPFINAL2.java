
package oopfınal2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Iterator;

public class OOPFINAL2 {

    public static void main(String[] args) {
        Book b1=new Book("a",40);
        Book b2=new Book("b",32);
        Book b3=new Book("c",23);
        Book b4=new Book("d",25);
        LinkedList books=new LinkedList();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        
        
        Collections.sort(books);
        
        Iterator iter=books.iterator();
        while(iter.hasNext()){
            Book b=(Book)iter.next();
            System.out.println(b.name+" "+b.price);
        }
        
    }
    
}

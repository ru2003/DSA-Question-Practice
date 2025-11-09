package LinkedList2;
import java.util.*;
/*3. Insert a Node at the Beginning / End / Given Position */
public class Q3INsertTheNode {



    public static void main(String[] args){
         LinkedList list = new LinkedList();
         
         list.insertAtEnd(10);
         list.insertAtEnd(20);
         list.insertAtEnd(30);
         list.display();

         list.insertAtBEginning(5);
         list.insertAtBeginning(2);
         list.display();

         list.insertAtPosition(99);
         list.insertAtposition(78);
         list.display();
         

    }
}

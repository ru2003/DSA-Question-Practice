package LinkedList;
/*- Linked list is a {linear data} structure where elements , called nodes, are connected using pointers .
 * -unlike arrays, linked list do not store elements in contiguous memory locations.instead each node contains data and reference to the next node in the sequence.
 * 
 * 
 * 
 * *******Advantages of Linked List*****
 * 1)dynamic size -linked lists can easiy grow or shrink in size by allocating or dellocating memory as needed.
 * 2)3efficient insertions/deletions--adding or removing nodes doesnt require shifting elemnts, as in arrays.
 * 3)memory utilization --memory is allocated only when required ,reducing wastage.
 * 
 * ************Disadvantages of Linked List******
 * 1)sequential access -> unlike arrays, linked lists do not allow direct access to elemnts via indices;traversal is necessary
 * 2)extra memory -> each node requires additional memory for the pointers
 * 3)complexity -> operations like reverse traversal or accessing previous nodes required more logic or a different list tupe.
 * 
 * linked list class ki jo object bante hai whi pure linked list hoti hain.
 */
public class first {

    public static class Node{
        int data;
        Node next;

        //constructor
        public Node(int data) {
            this.data = data;
            this.next = null; //isse ek single node create hogi 
        }
    }
    public static Node head;//creation of head
    public static Node tail;//creation of tail
    
     //methods
     /* 
       add() 
      remove() 
      print() 
      search()
      */


    //bakike bich me next address se dusre ko direct karenge.
    public static void main(String[] args) {
        first ll = new first(); //first class ki ek object banayi  hai "ll " naam se aur issipe sare nodes ko create krne wlai hun .
        
        ll.head = new Node(1);//linked list ke andat jo head hai wha pe ek nyi node create hogyi uske andar value 1 hai.
        ll.head.next = new Node(2);//ek linked next ko point kr rha hai wha pe 2 data save hain.
    }
    
}

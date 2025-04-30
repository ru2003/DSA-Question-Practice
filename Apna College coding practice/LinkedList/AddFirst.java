package LinkedList;
//add in the Linked List
public class AddFirst {

  public static class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
  }

  public static Node head;
  public static Node tail;
  public void addFirstnode (int data) {
    //step1 == create new node
    Node newNode = new Node(data);//Node =class ka nam , newNode=>object ka nam 

    //ste 2: newnode next =head ==>starting me add krna hain.
    newNode.next = head; //link
  }



    public static void main(String[] args) {
        AddFirst ll = new AddFirst();
    }
    
}

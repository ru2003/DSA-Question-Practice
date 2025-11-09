package LinkedList2;


public class Q1SinglyLinkedList {

    public static void main(String[] args){
        LinkedList list = new LinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.display();

        list.insertAtbeginning(5);
        list.display();

        list.deleteByValue(20);
        list.display();



        
    }
}

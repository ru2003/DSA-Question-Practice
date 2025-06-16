package LinkedList;
//Find the length of the linked list (iterative & recursive).
//iterative method

class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data  = data;
        this.next = null;
    }


}
       class _8LengthofLinkedList {
        Node head;

        public void push(int data) {

            //method to add new node at the front of the list
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;


        }
    public static void main(String[] args) {
        
    }
    
}

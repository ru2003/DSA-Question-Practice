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

        //recursive method to find length of the linked list
        public int getlengthofLinkedList(){
            int length = 0 ;
            Node current = head;

            while(current != null){
                length++;
                current = current.next;
            }
            return length;
        }

        public void printList() {
            Node current = head;
            while(current != null){
                System.out.println(current.data+" ");
                current = current.next;
            }
        }
    public static void main(String[] args) {
        _8LengthofLinkedList list = new _8LengthofLinkedList();

        list.push(4);
        list.push(1);
        list.push(4);
        list.push(8);


        System.out.println("Created Linked list is: ");
        list.printList();
        
        System.out.println("\nlength using iterative method: " + list.getlengthofLinkedList());
    }
    
}

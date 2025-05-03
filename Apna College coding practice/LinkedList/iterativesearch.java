package LinkedList;

public class iterativesearch {
    
    public static class Node {
        int data;
        Node next;
    
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
      public static Node head; //variable declaration
      public static Node tail;
      public static int size;/*
      public: The variable is accessible from other classes.

      static: The variable belongs to the class, not to any individual instance.

      int: The variable is of integer type.

      size: The name of the variable. */

    
        public void addFirstnode (int data) {
        
        //step1 == create new node
        Node newNode = new Node(data);//Node =class ka nam , newNode=>object ka nam 
        size++;
        if(head == null) {//agr existing linked list null ho and usme hame new nodeat starting add krna hoto uske liye ye condition hoti hain .
            head = tail = newNode;
            return;
        }
        //ste 2: newnode next =head ==>starting me add krna hain.
        newNode.next = head; //link
        
        //step 3 = head =newnode
        head = newNode;
      }
      
    
      public void addLast(int data) {
          Node newNode = new Node(data);
          size++;
          if(head == null) {
            head = tail = newNode;
            return;
          }
          tail.next = newNode;
          tail = newNode;
          }
    
          public void print() {
            if(head == null) {
                System.out.println("LL is empty");
                return;
            }
            Node temp = head;//becoz of therse lines we can print the linked list.
            while(temp != null) {
                System.out.print(temp.data+"-> ");
                temp = temp.next;
    
            }
            System.out.println("null");
          }

          public void add(int idx, int data) {
            if(idx == 0) {
                addFirstnode(data);
                return;
            }


           //creation of new node jo add krni hain.
            Node newNode = new Node(data);
            size++;
            Node temp = head;
            int i=0;

            while(i < idx-1) {//loop chalenge jis position pe add krna hai wha se 1 minus 
                temp = temp.next;
                i++;
            }
            //i=idx-1; temp->prev
            newNode.next = temp.next;
            temp.next = newNode;
          }
           //remove first elment mtlb head ko remove krte head ke next ko head assign kr dena.
          public int removeFirst() {
            if(size ==0) {
                System.out.println("LL is empty ");
                return Integer.MIN_VALUE;
            }else if(size == 1) {
                int val = head.data;
                head = tail = null;
                size =0; // agr ye condition satisfy hoti hai like 1 hi elemnt hain pure linked list me 
                return val;
            }
            int val = head.data;
            head = head.next;
            size --;
            return val;
          }

          //removing last element .
          public int removeLast() {
            if(size == 0) {
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;
            }else if(size == 1) {
                int val = head.data; //val variable me save hoga yes 
                head = tail = null; //nul kr denge value ko
                size = 0;
                return val;
            }
            //prev == second last tk jane ke liye last-2 krna padega becoz last wale ka last-1
            //upar wale toh exception the , abhi jab proper linked list hogi tab kya kre this is the below solution

            Node prev = head;
            for(int i=0; i<size-2; i++) {//This loop actually moves the prev pointer to the last node, not the second-last. As a result, prev.next becomes null, leading to a NullPointerException when you attempt to access prev.next.data.
                prev = prev.next;
            }

            int val = prev.next.data;
            prev.next = null;
            tail = prev;
            size --;
            return val;

          }


    
        public static void main(String[] args) {
            //AddinthMiddle ll = new AddinthMiddle();
            Removeelement ll = new Removeelement();

       
            ll.addFirstnode(2);
        
            ll.addFirstnode(1);
           
            ll.addLast(4);
        
            ll.addLast(5);
            ll.add(2,3);
            ll.print();
            //System.out.println(ll.size);
            ll.removeFirst();
            ll.print();
            ll.removeLast();
            ll.print();
            System.out.println(ll.size);
        }
    
}

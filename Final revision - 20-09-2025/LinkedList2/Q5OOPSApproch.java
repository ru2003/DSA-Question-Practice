package LinkedList2;

public class Q5OOPSApproch {

    static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Linkedlist{
        Node head;

        public void insertAtEnd(int data){
            Node newNode = new Node(data);

           if(head == null){
            head = newNode;
            return;
            } 
            Node temp  = head;
            while(temp != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }

        //display the linked list
        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public int serachElement(int key){
            Node temp = head;
           int position = 1;

            while(temp.next != null){
                if(temp.data == key){
                    return position;
                }else{
                    temp = temp.next;
                    position++;
                }
            }
            return -1;
        }

        


    }
    public static void main(String[] args){
        Linkedlist list = new Linkedlist();

        
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.display();


        list.serachElement(30);

    }
    
}

package LinkedList2;
//4. Delete a Node at Beginning / End / Given Position
public class Q4DeleteAnode {
   static  class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList{
        Node head;

        //delete a node from beginning
        public void deleteAtbeginning(){
            if(head == null){
                System.out.println("List is empty");
                return ;
            }
            head = head.next;
        }
            //delete from end
            public void deleteAtEnd(){
                if(head == null){
                    System.out.println("List is empty.");
                    return ;

                }

                if(head.next == null){
                    head = null;
                    return ;
                }

                Node temp = head;
                while(temp.next.next != null ){
                    temp = temp.next;
                }
                temp.next = null;
            }

            //delete from given position
            public void deleteAtPosition(int value, int pos){
                if(head == null || pos <= 0){
                    System.out.println("Invalid Position or empty list! ");
                    return ;
                }

                if(pos == 1){
                    head = head.next;
                    return ;
                }

                Node temp = head;
                for(int i=1; i <  pos-1 & temp!= null;i++){
                     temp = temp.next;
                }

               if(temp == null || temp.next == null){
                System.out.println("Position Out of range.");
                 return ;
               }
               temp.next = temp.next.next;
            }

            //display the linked list
            Node temp = head ;
          public void display(){
              while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
          }
        

    }
    public static void main(String[] args){
         LinkedList list = new LinkedList();

         list.head = new Node(10);
         list.head.next = new Node(20);
         list.head.next.next  =new Node(30);
          list.head.next.next.next  =new Node(40);
    }
}

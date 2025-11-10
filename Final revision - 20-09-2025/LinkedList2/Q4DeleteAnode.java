package LinkedList2;
//4. Delete a Node at Beginning / End / Given Position
public class Q4DeleteAnode {
    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    class LinkedList{
        Node head;

        //delete a node from beginning
        public void deleteAtbeginning(){
            if(head == null){
                System.out.println("List is empty");
                return ;
            }
            head = head.next;

            //delete from end
            public void deleteAtEnd() {
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
        }

    }
    public static void main(String[] args){
         
    }
}

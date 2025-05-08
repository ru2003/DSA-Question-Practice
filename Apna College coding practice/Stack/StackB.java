package Stack;
///implementing linkedlist using the Stack.

    
     public  class StackB{
          static class Node {
            int data;
            
          }
    }


          static class Stack {
            static Node head = null;

            public static boolean isEmpty() {
              return head == null;
            }

            //push 
            public static void push (int data) {
              Node newNode = new Node(data);
              if(isEmpty()) {
                head = newNode;
                return;

              }
              newNode.next = head;
              head = newNode;
            }

            //pop
          public static int pop() {
            if(isEmpty()) {
              return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
          }

          //peek
          public static int peek() {
            if(isEmpty()) {
              return -1;
            }
            return head.data;
          }
          }

          





    
        public static void main(String[] args) {
            //AddinthMiddle ll = new AddinthMiddle();
        /*Removeelement ll = new Removeelement();

       
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
            */

            Stack s = new Stack();
            s.push(1);
            s.push(2);
            s.push(3);


            while(!s.isEmpty()) {
              System.out.println(s.peek());
              s.pop();
            }

        }
    


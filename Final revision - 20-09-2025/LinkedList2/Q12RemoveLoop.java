package LinkedList2;
//12. Remove Loop in Linked List
/*
We use Floyd’s Cycle Detection Algorithm (Slow & Fast pointers).

Steps:

Use slow and fast pointers to detect the loop.

If they meet → loop exists.

Move slow to head.

Move both pointers one step at a time.

The point where fast.next == slow.next → loop link.

Set fast.next = null → loop removed.

⏱ Time: O(n)
🧠 Space: O(1)
 */

public class Q12RemoveLoop {

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args){
        
    }
}

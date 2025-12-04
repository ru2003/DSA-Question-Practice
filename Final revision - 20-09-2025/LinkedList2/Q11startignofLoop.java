package LinkedList2;
//2. Find the Starting Node of Loop (Important in Interviews)
/*
❌ slow == fast वाला point = loop ka starting point nahi hota!
Woh sirf meeting point hota hai.
Loop ka START aur meeting point most of the time DIFFERENT hote हैं.

Isiliye head se slow wapas le jaate हैं.
1 → 2 → 3 → 4 → 5
        ↑       ↓
        ← ← ← ←
Loop start = 3
⭐ IMPORTANT: “Meeting point हमेशा Loop Start नहीं होता”
⭐ अब REAL REASON:
Why slow = head?

Because one proven fact:

✔ Distance (head → loop-start)

=
✔ Distance (meeting-point → loop-start)

jab dono pointers 1-1 step chalें।

Ye math se prove hota hai (DSA theory),
but main tujhe example se 2 sec me samjhati hoon.

*/
public class Q11startignofLoop {
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

//9. Implement Two Stacks in an Array
/*
 * Both stacks do not overflow unless the entire array is full.
They grow in opposite directions:

Stack 1 grows from left to right

Stack 2 grows from right to left

✅ Real-Life Analogy
Imagine a single bookshelf 📚 where:

Stack 1 keeps adding books from the left side

Stack 2 adds books from the right side

Both should stop when there is no space left in between


 */

 class TwoStacks {
    int[] arr;
    int size;
    int top1, top2;

    //constructor
    TwoStacks(int n) {
        size = n;
        arr = new int[n];
        top1 = -1;
        top2 = n;    
    }

    //push to stack 1
    void push1(int x) {
        if(top1 < top2-1){
            arr[++top1] = x;
            System.out.println("Pushed " + x + " to Stack 1");
        }else{
            System.out.println("Stack Overflow (Stack 2)");
        }
    }

    //push to Stack 1
    int pop1() {
        if(top1 > 0) {
            return arr[top1--];
        }else {
            System.out.println("Stack Underflow (Stack 1) ");
            return -1;
        }
    }
     
    // Push to Stack 2
    void push2(int x) {
        if (top1 < top2 - 1) {
            arr[--top2] = x;
            System.out.println("Pushed " + x + " to Stack 2");
        } else {
            System.out.println("Stack Overflow (Stack 2)");
        }
    }
    //pop from Stack 2
    int pop2() {
        if(top2 < size) {
            return arr[top2++];
        }else {
            System.out.println("Stack Underflow (Stack 2)");
            return -1;
        }
    }

    //Display content of both stacks
    void display() {
        System.out.println("Stack 1: ");
        for (int i = 0; i<=top1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Stack 2: ");
        for(int i = size-1; i>= top2; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
 }

public class _9twoStacks {
    public static void main(String[] args){
        TwoStacks ts = new TwoStacks(10);

        ts.push1(1);
        ts.push1(2);
        ts.push1(3);

        ts.push2(100);
        ts.push2(200);
        ts.push2(300);

        ts.display();// // Should print Stack 1: 1 2 3 and Stack 2: 300 200 100
        
        ts.pop1();
        ts.pop2();

        ts.display();//Stack 1: 1 2, Stack 2: 300 200


    }
}
/* 
 * Problem We’re Solving:
You have very limited memory (like in embedded systems, old mobile apps, or memory-constrained environments).

Now suppose you need:

One stack to undo actions in an app

Another stack to redo actions

You could do:

Two separate arrays, but that wastes space.

❌ One stack may use up all its space even if the other is empty.

So instead, we say:

“Let’s create just one array.
Let Stack 1 grow from the left.
Let Stack 2 grow from the right.”


 You See	💡 What’s Actually Happening
One array => 	Memory-efficient shared space
Two stacks =>  pushing	Two separate pointer systems (top1 and top2)
Avoid overflow	=> By ensuring top1 < top2 - 1
Still independent	=> Stack 1 & Stack 2 never overwrite each other
Real-world use=>	Undo/redo, browser history, split-memory operations

 */
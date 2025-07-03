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

 }
public class _9twoStacks {
    
}

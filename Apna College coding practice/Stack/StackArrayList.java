package Stack;//Declares that this class is part of the Stack package.
import java.util.ArrayList;//Imports the ArrayList class from the Java standard library, which will be used to store stack elements.
public class StackArrayList {

        static class Stack {//Defines a nested static class named Stack. This class contains the stack's data and methods.
            static ArrayList<Integer> list = new ArrayList<>();//Initializes a static ArrayList to hold integer elements of the stack.
            //This setup is a starting point for implementing a stack data structure using an ArrayList.
            public static boolean isEmpty() {//: Checks if the stack is empty by verifying if the size of the list is zero.
                return list.size() ==0;
            }
            //push
            public static void push (int data)// list ka jo .add function hota hai woh list ke akahri index pr apne data ko kr deta hain . stack ke top pr jo hamara data hota hain woh add hogya .
              {
                list.add(data);
              }
              //pop ==>  stack se delete krne ke liye pop use kiya jata hai ==>pehle woh return hota hain.
              public static int pop() {
                
              }
        }
    



    public static void main(String[] args) {
        
    }
    
}

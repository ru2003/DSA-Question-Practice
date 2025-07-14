//2. Write the code to find the Fibonacci series upto the nth term.

public class _2Fibonaciiseries {
     public static void main (String[] args){
         int firstname = 0 ;
         int secondname  = 1;
         int num = 10;
         for(int i=1;i<=num;i++){
            System.out.println(firstname + " ");
            int next = firstname+secondname;
            
            firstname = secondname;
            secondname = next;

         }
     }
}

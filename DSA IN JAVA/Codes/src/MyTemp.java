import java.util.Scanner;

public class MyTemp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


       // System.out.println("what is your name?");
        //String firstName = sc.next();


       // System.out.println("what is your age?");
      //  String ageInput = sc.next();
       // int age = Integer.parseInt(ageInput); 


       
       //System.out.println("What is your address?");
      // sc.nextLine();// just to ignore the \n
       // String address = sc.nextLine();

       
        //System.out.println( " hi " + firstName  + " you are " + age  + "years old");
        //System.out.println("You live in"+ address);


        //UNARY operator
        int op1=10;
        op1++;
        System.out.println(op1);
        op1--;
        System.out.println(op1);
       

       int y = --op1;
       int x = ++op1;
       System.out.println(op1 + " " + x + " " + y );


       int z = op1++;//post-increment=>op ki jo value thi woh asign kr di n badme operator chalya
       int a = op1--;
       System.out.println(op1 + " " + x + " " + y +" "+z+ " "+a);
      
        
      // sc.close();
      
        
    }
}
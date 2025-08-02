/*
 * ✅ 4. Voting Eligibility Checker (with Multiple Users)
🧠 Take input of multiple users and check if they are eligible to vote (18+).

Use: loop to take multiple entries

Use: if-else to check age

Method: checkEligibility(int age)


 */
import java.util.*;
public class _9VoteEligibility {
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);

          System.out.println("Enter the number of users to check: ");
          int numberofUsers = sc.nextInt();

          for (int i=1;i<=numberofUsers;i++){
            System.out.println("\nEnter age of user "+ i + ":");

            int age = sc.nextInt();
            //call method to check eleigibility
            checkeligibility(age);
          }
    }

  public static void checkeligibility(int age){
    if (age>=18){
    System.out.println("Eligible for the voting.");
    }else{
        System.out.println("Not eligible for voting.");
    }
  }
}

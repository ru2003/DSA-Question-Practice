/*Concepts used: nested if-else, for loop, input validation
🧠Use Case: Take marks of 5 subjects and calculate total, percentage, and grade.
 */


import java.util.*;

public abstract class _3StudentGradeSystem {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int[] marks = new int[5];
         int total = 0;
       
         for(int i=0; i<5; i++) {
            System.out.println("Enter marks for subject " + (i+1)+":");
            marks[i] = sc.nextInt();
            total += marks[i];
         }

         double percentage = total / 5.0;
         System.out.println("Percentage :"+ percentage);
         
         
         if(percentage >= 90){
            System.out.println("Grade :A+");
         }else if(percentage >= 75){
            System.out.println("Grade :A");      
         }else if(percentage >=60){
            System.out.println("Grade :B");
         }else if(percentage >= 40){
            System.out.println("Grade :C");
         }else {
            System.out.println("Grade: F(Fail)");
         }
         
    }
}


//Write a program thatreadsasetofintegers,andthenprintsthesumoftheeven and odd integers.
import java.util.Scanner;
public class EvenoddSum {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int sumEven = 0 , sumOdd = 0;
        System.out.println("Enter numbers(enter -1 to stop ): ");
         //we will while loop becoz we dont know the how many exact times it is going to run.
        while (true){
            int num = sc.nextInt(); // inside the loop does matter because it ensures that a new number is read during each iteration of the loop.
//Each iteration reads a new number from the user.

/*If the number is -1, it immediately stops the loop.
If not, it checks whether the number is even or odd and updates the sums accord 
*****The value of num is read only once before entering the loop.

The loop never updates num inside the loop, meaning the same value is checked repeatedly.

If num is not -1 initially, the loop runs infinitely because num never changes.

The program will not ask for new numbers, which is incorrect.

*/

            if (num == -1){
                break;
            }

            if (num % 2 ==0){
                sumEven += num;
            }else{
                sumOdd += num;
            }
        }
        sc.close();
    
    System.out.println("Sum of even numbers:" + sumEven);
    System.out.println("Sum of odd numbers:"+ sumOdd);
}
}

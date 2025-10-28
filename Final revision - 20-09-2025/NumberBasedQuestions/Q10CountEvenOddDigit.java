package NumberBasedQuestions;
//10. Count even and odd digits in a number.
public class Q10CountEvenOddDigit {
    public static int countEvenOdd(int number){
        int counteven = 0;
        int countodd = 0;
         while (number != 0){
            int digit  = number % 10;
            if(digit % 2 == 0){
                counteven++;
            }else{
                countodd++;
            }
         }
    }
    public static void main(String[] args){

    }
    
}

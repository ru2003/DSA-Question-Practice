package NumberBasedQuestions;
//
public class Q14largestOfThree {
    public static void main(String[] args){

        int num1 = 6;
        int num2 = 10;
        int num3 = 67;

        if(num1 > num2  && num1 > num3){
            System.out.println("nume is the largest.");
        }else if(num2 > num1 && num2 > num3){
            System.out.println("num2 is the greates.");
        }else{
            System.out.println("num3 is the greatest.");
        }
    }
}

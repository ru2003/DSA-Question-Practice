package NumberBasedQuestions;

public class Q3FactorialOfNum {
    public static void main(String[] args){
        int num = 9;
        int factorial = 1;
        
        for(int i=1; i<=9; i++){
            factorial *= i;
        }
        System.out.println("The factorial of the number is "+ factorial);
    }
}

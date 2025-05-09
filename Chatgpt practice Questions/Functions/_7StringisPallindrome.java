/* 7.Create a function to check if a string is a palindrome.*/

public class _7StringisPallindrome {

    public static boolean isPallindrome(String str) {
       

        int left =0;
        int right=str.length()-1;

        //comparing left and right of both the ends
        while(left<right){
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
    public static void main(String[] args) {
      String input = "Madam";
      if(isPallindrome(input)){
        System.out.println("the give string" + input + " is Pallindrome.");
      }
    }
}

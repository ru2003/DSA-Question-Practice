public class Q5Pallindromeornot {
    public static void main(String[] args){
         String ruchita ="ruchita";
         String reversed ="" ;

         for(int i=ruchita.length()-1 ;i>=0;i--){
            reversed += ruchita.charAt(i);
         }

         if(reversed == ruchita){
            System.out.println("The given string is pallindrome");
         }else{
            System.out.println("The given string is not pallindrome.");
         }
    }
}

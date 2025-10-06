package Strings;

public class Q9WithoutUsingBuiltIn {
    public static void main(String[] args){
        String str = "Ruchita123";

        boolean allDigits = true;
        boolean allLetter = true;
        
       for(int i=0; i<=str.length()-1; i++){
          char ch = str.charAt(i);
          
          if (!Character.isDigit(ch)) {
            allDigits = true;
          }
          if (!Character.isLetter(ch)) {
            allLetter = false;
          }

       } 

       if (allDigits){
        System.out.println("String contains only digits.");
       }

    }
}

/*4.Write a function to return the number of vowels in a string. */

public class _4vowelsnumber {

    public static int  numberofVowels( String str){
         int count  = 0;
         str = str.toLowerCase();//to handle upper case.

         for (int i =0; i<str.length();i++){
            char ch = str.charAt(i); //get each character.
            
            if(ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }

         }
         return count;


    }

    public static void main(String[] args) {
           
    }
    
}

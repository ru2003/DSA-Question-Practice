/*4.Write a function to return the number of vowels in a string. */

public class _4vowelsnumber {
/*Java passes the value, not the variable name. */
    public static int  numberofVowels( String str){
         int count  = 0;
         str = str.toLowerCase();//to handle upper case.

         for (int i =0; i<str.length();i++){
            /*if (str.charAt(i) == 'a') { -->to get the element at index this is method
              // do something
            } */
            char ch = str.charAt(i); //get each character.
            //We're storing that character in a character variable named ch.
            
            if(ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
         }
         return count;
    }

    public static void main(String[] args) {
           String input = "hello world";
           int vowelcount = numberofVowels(input);
           System.out.println(vowelcount);
    }
    
}

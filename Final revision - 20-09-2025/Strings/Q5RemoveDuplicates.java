package Strings;
//5. Remove duplicates from a string.
/*indexOf() is a String method used to find the position (index) of a character or a substring inside a string.
1️⃣ Finding character position
String s = "Ruchita";

int index = s.indexOf('h');
System.out.println(index);
 * 
 */
public class Q5RemoveDuplicates {
   public static void main(String[] args){
         
    String str = "Chaudhari";
    String result ="";

    for(int i=0; i<=str.length()-1 ; i++){
         char ch = str.charAt(i);

         //check if character is already present or not.
         if(result.indexOf(ch) == -1) {
            result +=ch;
         }
    }
    System.out.println("String after removing duplicates: " + result);
   } 
}

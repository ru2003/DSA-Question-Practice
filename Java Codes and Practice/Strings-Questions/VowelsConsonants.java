/* write ajava code to count the number of vowels and consonants in a string */
/* toCharArray() ==> is a string method that converts the string into a chracter array
 * this loops iterated over each character in the array
 * each character is stored in variable c during each iteration
 * 
 */

import java.util.Scanner;
public class VowelsConsonants {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        scanner.close();

        input = input.toLowerCase();

        int vowels = 0, consonants = 0 ;

        //loop through each character
        for(char c: input.toCharArray()){
            if(Character.isLetter(c)){
                if(c=='a' || c =='e' || c =='i' || c =='o' || c =='u'){
                    vowels++;
                }else{
                    consonants++;
                }
            }
        }
        System.out.println("number of vowels:"+vowels);
        System.out.println("Number of consonants:"+consonants);


    }


    
}

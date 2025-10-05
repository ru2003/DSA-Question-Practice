package Strings;
//3. Count vowels and consonants.

public class Q4CountVowels {
    public static void vowelsConsonantsCount(String str){

        int vowels = 0;
        int consonants =0;

        for(int i=0; i<=str.length()-1 ; i++ ){
            //first u have to retrieve the each character and convert that into the lwercase ..
            char ch =Character.toLowerCase(str.charAt(i));
            if(ch == 'a' || ch =='e' || ch=='i' || ch=='o' || ch=='u'){
                vowels++;
            }else{
                consonants++;
            }
        }
    }
    public static void main(String[] args){
        

    }
}

package Strings;
//0. Print all substrings of a string.

public class Q10SubString {
    public static void main(String[] args){
          
        String str = "Ruchita";

        //outer loops starting index;
        for(int i=0; i<str.length()-1; i++){
            //inner loop " ending index
            
            for(int j=i+1; j<=str.length(); j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
}

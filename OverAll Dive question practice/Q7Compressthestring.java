public class Q7Compressthestring {
    public static void main(String[] args){

        String input = "aaabbbrrrt";
        String compressed = CompressTheString(input);

        System.out.println("String after compression: " + compressed);
    }


    public static String CompressTheString(String str){

        if( str == null || str.isEmpty()){
            return str;
        }

        StringBuilder result = new StringBuilder();
        int count = 1;

        for(int i=0;i<str.length()-1 ;i++){
            if(str.charAt(i) == str.charAt(i+1)){
                count++;
            }else{
                result.append(str.charAt(i)).append(count);
                count =1;
            }
        }

        //append the last character and it count
        result.append(str.charAt(str.length()-1)).append(count);
        return result.toString();
        

    }
}

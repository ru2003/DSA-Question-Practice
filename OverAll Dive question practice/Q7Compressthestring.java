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

    }
}

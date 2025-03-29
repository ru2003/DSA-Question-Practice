/* Check if a astring contains only digits  */



public class DigitsOnly {
    public static boolean isNumeric(String str){

        for(char c:str.toCharArray()){
            if(!Character.isDigit(c)){ //if c is not a digit ,return false 
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args){
        String input = "1235s565";
        System.out.println("Is numeric?" + isNumeric(input));
    }
    
}

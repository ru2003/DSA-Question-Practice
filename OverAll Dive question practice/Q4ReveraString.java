public class Q4ReveraString{
    public static void main(String[] args){
       String ruchita = "Hello";
       String reversed ="";
       
       for (int i=ruchita.length()-1 ;i>=0;i--){
        reversed += ruchita.charAt(i);
       }
       System.out.println("Reversed String is: " + reversed);
    }
}
//Java Program to Find the Area of a Circle

import java.util.Scanner;
public class AreaofCircle {
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);

      //take the input 
      System.out.println("Enter the radius of circle: ");
      double  radius = scanner.nextDouble();

      double  result  = Math.PI*(radius)*(radius);
      System.out.println("Area of circle is "+ result);
        
      


    }
    
}

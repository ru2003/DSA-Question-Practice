/*6.Write a function to convert Celsius to Fahrenheit.
 */

public class _6CelciustoFahrenheit {
      public static double celciusconvertor(double num) {
         double result = (num*9/5) +32;
         return result;
      }

    public static void main(String[] args) {
         double number = 36;
         System.out.println(" The tempperature after converting into fahrenheit:"+celciusconvertor(number));
    }
}

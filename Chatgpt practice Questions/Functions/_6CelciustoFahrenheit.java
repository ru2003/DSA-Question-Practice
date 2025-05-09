/*6.Write a function to convert Celsius to Fahrenheit.
 */

public class _6CelciustoFahrenheit {
      public static int celciusconvertor(int num) {
         int result = (num*9/5) +32;
         return result;
      }

    public static void main(String[] args) {
         int number = 35;
         System.out.println(" The tempperature after converting into fahrenheit:"+celciusconvertor(number));
    }
}

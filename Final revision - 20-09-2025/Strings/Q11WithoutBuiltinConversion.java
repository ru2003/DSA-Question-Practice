package Strings;
/*
 * 🔹 Approach 2: Without Using Built-in Methods

👉 We can use ASCII values for conversion.

Character	ASCII value
'A'–'Z'	65–90
'a'–'z'	97–122

Difference = 32
 */
public class Q11WithoutBuiltinConversion {
    public static void main(String[] args) {
        String str = "RuChiTA";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32); // convert to lowercase
            } else if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32); // convert to uppercase
            } else {
                result += ch; // keep non-alphabet characters same
            }
        }

        System.out.println("Converted string: " + result);
    }
}

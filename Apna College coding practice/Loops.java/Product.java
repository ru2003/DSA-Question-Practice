/* Que ==>You are given a list of products with their prices. 
Print each product and its price in the format: "Product Name - Price".*/

public class Product {

    public static void main(String [] args) {
         // arrays to store the products name and their corresponding price.
         String[] product ={"Laptop" , " mobile", " headphones" , " keyboard"};
         int[] prices = {120000, 450000, 650000, 75000};
/* NotE ==> using a parallel arrays ,both the arrays must have same length  
 * using a for loop to print a each product and its price.
 * products[i] gives the product name at index i

prices[i] gives the corresponding price at index i
   */
        
         for(int i=0; i<product.length; i++) {
            System.out.println(product[i] + "- " + prices[i]);
         }
    }
    
}

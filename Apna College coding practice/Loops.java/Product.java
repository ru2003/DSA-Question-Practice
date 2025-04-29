/*You are given a list of products with their prices. 
Print each product and its price in the format: "Product Name - Price".*/

public class Product {

    public static void main(String [] args) {
         // arrays to store the products name and their corresponding price.
         String[] product ={"Laptop" , " mobile", " headphones" , " keyboard"};
         int[] prices = {120000, 450000, 650000, 75000};

         //using a for loop to print a each produc and its price
         for(int i=0; i<product.length; i++) {
            System.out.println(product[i] + "- " + prices[i]);
         }
    }
    
}

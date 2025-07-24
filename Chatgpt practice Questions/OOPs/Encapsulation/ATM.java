// ATM hides all the complex internal logic (data hiding).

//You interact only with a simple interface (buttons/screen).

//It allows only valid operations and prevents misuse (e.g., can't withdraw more than balance).


public class ATM {

    //private data (encapsulation)
    private double balance;
    
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited: Rs." + amount);
        }
    }

    public static void main(String[] args){
 
    }
    
}

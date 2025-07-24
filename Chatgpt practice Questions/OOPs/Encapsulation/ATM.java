// ATM hides all the complex internal logic (data hiding).

//You interact only with a simple interface (buttons/screen).

//It allows only valid operations and prevents misuse (e.g., can't withdraw more than balance).


public class ATM {

    //private data (encapsulation)
    private double balance;

    public ATM(double initialBalance){
        if(initialBalance > 0){
            balance = initialBalance;
        }else {
            balance = 0;
        }
    }
    
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited: Rs." + amount);
        }
    }

    public static void main(String[] args){
 
    }
    
}

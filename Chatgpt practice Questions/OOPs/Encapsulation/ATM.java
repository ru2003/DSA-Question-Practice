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
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn: Rs." + amount);
        }else{
            System.out.println("Invalid amount or insufficient balance.");
        }
    }
    
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited: Rs." + amount);
        }else{
            System.out.println("Invalid deposit amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args){
      ATM atm = new ATM(1000);

      //call public methods
      System.out.println("Current balance: " + atm.getBalance());

      atm.deposit(500);
      System.out.println("Balance after deposit: Rs." + atm.getBalance());

      atm.withdraw(100);
      System.out.println("Balace after withdrawn: Rs." + atm.getBalance());

    }
    
}

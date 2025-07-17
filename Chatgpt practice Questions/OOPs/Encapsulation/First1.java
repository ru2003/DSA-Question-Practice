//bank account example:
public class First1{

   //Private fields: data hiding
   private String accountHolderName;
   private double balance;
   
   //constructor
   public First(String name, double intialBalance) {
          this.accountHolderName = name;
          if(initialBalance > 0) {
            this.balance = initialBalance;
          }else{
            this.balance = 0;
          }
   }

   //public getter for name
   public String getAccountHoldername() {
    return accountHolderName ;
   }
   //public setter for name
   public void setAccountHolderName(String name){
    this.accountHolderName = name;
   }
//Deposit method with validation
public void deposit(doubke amount) {
    if(amount > 0){
        balance += amount;
        System.out.println("Amount deposited successfully!");
    }else{
        System.out.println("Invalid deposit amount");
    }
}
//withsrawl method with validation
public void withdral(double amount) {
    if(amount>0 && amount <=balance){
        balance -= amount;
        System.out.println("Amount withdrawl succefully");
    }else{
        System.out.println("Invalid or insufficient balance.");
    }
}



   public class First{
    public static void main(String[] args){
        
    }
   }
}

//bank account example:
public class First{

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
    }
}



    public static void main(String[] args){

    }
}

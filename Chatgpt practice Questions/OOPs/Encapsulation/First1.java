//bank account example:
public class First1{

   //Private fields: data hiding
   private String accountHolderName;
   private double balance;
   
   //constructor
   public First1(String name, double initialBalance) {
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
public void deposit(double amount) {
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
        First1 account = new First1("Ruchita" , 1000);

        //accessing thorugh public methids only
        System.out.println("Account Holder: " + account.getAccountHoldername());
        System.out.println("Initial Balance: " + account.getBalance);

        account.deposit(500);
        System.out.println("Updated Balance: " + account.getBalance());

        
    }
   }
}

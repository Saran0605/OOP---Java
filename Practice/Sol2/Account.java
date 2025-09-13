package Practice.Sol2;

public class Account {
    int accountNumber;
    String accountHolderName;
    double balance;

    public Account(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public double deposit(double amount){
        this.balance +=amount;
        return this.checkBalance();
    }
    public double withdraw(double amount){
        if(amount<this.balance){
            this.balance-=amount;
            return this.checkBalance();
        }
        else{
            System.out.println("Balance insuffiecient");
            return this.checkBalance();
        }

    }
    public double checkBalance(){
        return this.balance;
    }
    public void displayDetails(){
        System.out.println(this.accountNumber + " " + this.accountHolderName);
    }
}

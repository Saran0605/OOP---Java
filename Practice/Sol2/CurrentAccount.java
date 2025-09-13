package Practice.Sol2;

public class CurrentAccount extends Account {
    double overDraftLimit;

    public CurrentAccount(int accountNumber, String accountHolderName, double balance, double overDraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overDraftLimit = overDraftLimit;
    }
    public double withdraw(double amount){
        if(amount<this.overDraftLimit){
            this.balance-=amount;
            return this.checkBalance();
        }
        else{
            System.out.println("Exceeding overdraftlimit");
            return  this.checkBalance();
        }


    }
}

package Practice.Sol2;

public class SavingsAccount extends Account {
    double interestRate;
     SavingsAccount(int accountNo, String accountHolder, double balance, double interestRate){
        super(accountNo,accountHolder,balance);
        this.interestRate = interestRate;
    }

    void addInterest(double interest){
         this.interestRate = interest;
    }


}

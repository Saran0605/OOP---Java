package Practice.Sol2;

public class BankTest {
    public static void main(String[] args) {
        Account ac1 = new SavingsAccount(201,"saran",100000,14);
        Account ac2 = new CurrentAccount(202,"swetha",200000,50000);
        System.out.println(ac1.checkBalance());
        ac1.deposit(50000);
        System.out.println(ac1.checkBalance());
        System.out.println(ac2.checkBalance());
        ac2.withdraw(70000);
        System.out.println("Amount:"+ ac1.withdraw(2000)
        );




    }
}

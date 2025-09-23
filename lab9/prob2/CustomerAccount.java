package lab9.prob2;
public class CustomerAccount {
    private String cusName;
    private String accNo;
    private double balance;

    public CustomerAccount(String cusName, String accNo, double balance) {
        this.cusName = cusName;
        this.accNo = accNo;
        this.balance = balance;
    }

    public boolean deposit(double amount) {
        if (amount < 0)
            throw new IllegalArgumentException("Amount must be greater than zero");

        balance += amount;
        System.out.println("Deposited $" + amount + " successfully. New balance: $" + balance);
        return true;
    }

    public boolean withdraw(double amount) throws AccountException{
            if (amount < 0)
                throw new IllegalArgumentException("Amount must be greater than zero");
            else if(amount > balance)
                throw new AccountException("Insufficient funds! Withdrawal amount exceeds balance.");
            else if(balance-amount < 100)
                throw new AccountException("Low balance warning! Balance cannot go below $100.");

            balance -= amount;
            System.out.println("Withdrew $" + amount + " successfully. New balance: $" + balance);
            return true;
    }

    public double getBalance() {
        return balance;
    }
}

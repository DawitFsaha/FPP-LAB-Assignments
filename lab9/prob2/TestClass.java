package lab9.prob2;

public class TestClass {

    static void main(String[] args) {
        CustomerAccount account = new CustomerAccount("Alice", "ACC1001", 500);

        // 1. Deposit with negative input
        try {
            System.out.println("Attempting negative deposit...");
            account.deposit(-50);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // 2. Withdraw more than balance
        try {
            System.out.println("\nAttempting to withdraw more than balance...");
            account.withdraw(600);
        } catch (AccountException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // 3. Withdraw valid amount that drops below $100
        try {
            System.out.println("\nAttempting withdrawal that leaves < $100...");
            account.withdraw(450); // leaves only $50
        } catch (AccountException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // 4. Successful deposit and withdraw
        try {
            System.out.println("\nMaking successful deposit...");
            account.deposit(200);

            System.out.println("\nMaking successful withdrawal...");
            account.withdraw(250);

            System.out.println("Final balance: $" + account.getBalance());
        } catch (Exception e) {
            System.out.println("Unexpected exception: " + e.getMessage());
        }

    }
}

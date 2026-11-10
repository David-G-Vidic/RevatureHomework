package StarterExercises.BankAccount;

public class BankAccountsMain {
    public static void main(String[] args) {
        BankAccount bill = new BankAccount(5000.0);

        System.out.println("initial balance: "+ bill.getBalance());
        System.out.println("deposit 200, new balance:  " + bill.deposit(200));
        bill.withdraw(400);
        System.out.println("withdraw 400, new balance: " + bill.getBalance());

        System.out.println("deposit -100, current balance: "+ bill.deposit(-100)  );
        System.out.println("withdraw 6000, current balance: " + bill.withdraw(6000));

        SavingsAccount savory = new SavingsAccount(200.0);
        System.out.println("initial balance: "+ savory.getBalance());
        System.out.println("deposit 200, new balance:  " + savory.deposit(200));
        System.out.println("withdraw 400, new balance: " + savory.withdraw(400));
        System.out.println("withdraw 500, new balance: " + savory.withdraw(500));



    }
}

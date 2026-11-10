package StarterExercises.BankAccount;

public class BankAccount {
    private double balance;
    //new empty bank account

    public BankAccount(double initialBalance){
        balance = initialBalance;
    }
    public BankAccount(){
        balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount){
        if (amount > 0) {
            balance += amount;
        }
        else {
            System.out.println("You have to deposit more than 0.0.");
        }
        return balance;
    }
    public double withdraw(double amount){
        if (amount <= balance) {
            balance -= amount;
        }
        else {
            System.out.println("You do not have enough funds in your account. ");
        }
        return balance;
    }

}

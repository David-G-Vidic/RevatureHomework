package StarterExercises.BankAccount;

public class SavingsAccount extends BankAccount{


    public SavingsAccount(double amount) {
        super(amount);
    }


    @Override
    public double withdraw(double amount) {
//        if (amount > getBalance()){
//            System.out.println("You do not have enough funds in your account.");
//        }
//        else
        if (amount > (getBalance() -100)){
            System.out.println("You do not have enough available funds in your account.");
            System.out.println("Your savings account requires at minimum $100.");
        } else {
            withdraw(amount);
        }
        return getBalance();

    }
}

public interface IAccount {

    String getAccountNumber();

    String getName();

    double getBalance();

    String getAccountType();

    String getStatus();

    void deposit(double amount)
            throws InvalidAmountException;

    void withdraw(double amount, String enteredPin)
            throws AccountException;

    void displayAccountInfo();
}
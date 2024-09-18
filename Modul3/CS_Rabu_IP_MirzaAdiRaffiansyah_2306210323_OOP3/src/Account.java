public class Account {
    private int accountNumber;
    private double balance;
    private Bank bank;
    private AccountType accountType;

    Account(int accountNumber, double balance, Bank bank, AccountType accountType) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.bank = bank;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public Bank getBank() {
        return bank;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

     public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if(amount > 0){
            balance += amount;
        } else {
            System.out.println("ERROR");
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && balance >= amount) {
           balance -= amount;
        } else {
            System.out.println("ERROR");
        }
    }

    public void addInterest() {
        balance = bank.getInterestRate();
    }

    public void showDetail() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance : " + balance);
        System.out.println("Bank Code : " + bank.getBankId());
        System.out.println("Account Type : " + accountType);

    }
}

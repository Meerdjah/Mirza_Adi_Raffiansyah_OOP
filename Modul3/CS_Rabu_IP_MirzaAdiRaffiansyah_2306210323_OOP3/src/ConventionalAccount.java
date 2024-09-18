public class ConventionalAccount extends Account{
    private double credit;
    private double creditInterestRate;

    ConventionalAccount(int accountNumber, double balance, Bank bank, AccountType accountType, double creditInterestRate) {
        super(accountNumber, balance, bank, accountType);
        this.credit = 0;
        this.creditInterestRate = creditInterestRate;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public void payCredit() {
        if(getBalance() >= credit) {
            setBalance(credit);
        } else {
            System.out.println("ERROR");
        }
    }

    public void addCredit(double amount) {
        credit = credit + (amount*creditInterestRate/100);
    }

    public void addCredit(double amount, double discountRate){
        credit = credit + (amount*discountRate/100);
    }

    @Override
    public void showDetail() {
        super.showDetail();
        System.out.println("Credit : " + credit);
        System.out.println("Interest Rate : " + creditInterestRate);
    }
}

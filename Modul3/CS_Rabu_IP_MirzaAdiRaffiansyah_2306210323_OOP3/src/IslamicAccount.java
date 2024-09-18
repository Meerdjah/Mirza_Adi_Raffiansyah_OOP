public class IslamicAccount extends Account{
    private double mudhorobahRate;

    IslamicAccount(int accountNumber, double balance, Bank bank, AccountType accountType, double mudhorobahRate) {
        super(accountNumber, balance, bank, accountType);
        this.mudhorobahRate = mudhorobahRate;
    }

    public double getMudhorobahRate() {
        return mudhorobahRate;
    }

    @Override
    public void addInterest() {
        setBalance(mudhorobahRate);
    }

    @Override
    public void showDetail() {
        super.showDetail();
        System.out.println("Mudhorobah Rate : " + mudhorobahRate);
    }
}

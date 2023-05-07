package FirstBank;

public class BankAccount {

    private  String accountName;
    private  int accountNumber;
    private  int accountBalance;
    private  int deposit;
    private  int withdrawal;

    public BankAccount(String accountName, int accountNumber, int accountBalance, int deposit, int withdrawal) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.deposit = deposit;
        this.withdrawal = withdrawal;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getWithdrawal() {
        return withdrawal;
    }

    public void setWithdrawal(int withdrawal) {
        this.withdrawal = withdrawal;
    }

    public double balanceAfterDeposit(){
        return getAccountBalance() + getDeposit();
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountName='" + accountName + '\'' +
                ", accountNumber=" + accountNumber +
                ", accountBalance=" + accountBalance +
                ", deposit=" + deposit +
                ", withdrawal=" + withdrawal +
                '}';
    }

    public double balanceAfterWithdraw(){
        return( getAccountBalance() + getDeposit()) -getWithdrawal();
    }
}

package FirstBank;

public class FirstBankTest {
    public static void main(String[] args) {

        BankAccount bankAccount=new BankAccount("afolabi racheal",305370567,10000,5000,7500);

        System.out.println(bankAccount);
        System.out.println( "your total balance after deposit is" + ":" +bankAccount.balanceAfterDeposit());
        System.out.println("your total balance after withdrawal is" + ":" +bankAccount.balanceAfterWithdraw());
    }
}

/**
 * BankAccount
 */
public class BankAccount {

    private String accountNumber;
    private String name;
    private double balance;

    BankAccount()
    {
        accountNumber=" ";
        name=" ";
        balance=0.0;
    }

    public void setAccountNumber(String accNum)
    {
        accountNumber = accNum;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }

    public void setBalance(double balances)
    {
        this.balance = balances;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public String getName()
    {
        return name;
    }

    public double getBalance()
    {
        return balance;
    }
    
    public void explainAccountPolicy()
    {
        System.out.println("$4 service fee will be deducted each month.");
    }

    public void deductMonthlyFee()
    {
        balance-=4.0;
    }
}
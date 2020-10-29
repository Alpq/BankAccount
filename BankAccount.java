// THANKS TO RENG ZHENG AND STEVEN LEI FOR HELPING PROVIDE TEST CASES
public class BankAccount{
  private double balance = 0;
  private int accountID;
  private String password;

  public BankAccount(int ID, String pass)
  {
    this.accountID = ID;
    this.password = pass;
  }
  public double getBalance()
  {
    return this.balance;
  }
  public int getAccountID()
  {
    return this.accountID;
  }
  public void setPassword(String pass)
  {
    this.password = pass;
  }
  public boolean deposit(double amount)
  {
    boolean truth = amount >= 0;
    if (truth)
    {
    this.balance = this.balance + amount;
      return truth;
    }
    return truth;
  }
  public boolean withdraw(double amount)
  {
    boolean truth = amount >= 0 && (this.balance >= amount);
    if (truth)
    {
      this.balance = this.balance - amount;
      return truth;
    }
    return truth;
  }
  public String toString()
  {
    return Integer.toString(this.accountID) + "\t" + this.balance+"";
  }
}

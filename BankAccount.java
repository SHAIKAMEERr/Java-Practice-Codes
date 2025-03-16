import java.util.Scanner;
class Account
{
    String name;
    long accNo;
    String address;
    long phoneNo;
    String dob;
    double amount;
    String getName()
    {
        return name;
    }
    long getAccountNo()
    {
        return accNo;
    }
    String getAdress()
    {
        return address;
    }
    long getPhoneNo()
    {
        return phoneNo;
    }
    String getDob()
    {
        return dob;
    }
    double getAmount()
    {
        return amount;
    }
    String setAddress()
    {
        return address;
    }
    long phoneNo()
    {
        return phoneNo;
    }
    String dob()
    {
        return dob;
    }
    Account()
    {
        name="Ameer";
        accNo=1234567890l;
        address="14/45G-B1, T.N. Nagireddy Street ";
        phoneNo=7075850587l;
        dob="2000-10-20";
        amount=12345678.75d;
    }
    Account(String address,long phoneNo,String dob)
    {
        System.out.println(name="Ameer");
        accNo=1234567890l;
        this.address=address;
        this.phoneNo=phoneNo;
        this.dob=dob;
        amount=12345678.89d;
    }
}
class SavingsAccount extends Account
{
    double deposit;
    double withdrawl;
    double pres;
    double curr;
    double presentBalance;
    double getDeposit()
    {
        return deposit;
    }
    double getWithdrawl()
    {
        return withdrawl;
    }
    double currentBalance()
    {
        curr=amount+deposit;
        return curr;
    }
    SavingsAccount()
    {
        deposit=12000;
        withdrawl=50000;
    }
    double presentBalance()
    {
        return amount-withdrawl;
    }
}
class LoanAccount extends Account
{
    double loanAmount;
    double payEmi;
    double topup;
    double repay;
    double balanceLoanAmount;
    short months;
    void getloanAmount(double loanAmount)
    {
        this.loanAmount=loanAmount;
    }
    void getPay(double payEmi)
    {
        this.payEmi=payEmi;
    }
    void gettopup(double topup)
    {
        this.topup=topup;
    }
    void getRepay(double repay)
    {
        this.repay=repay;
    }
    double loanBal()
    {
        balanceLoanAmount=(payEmi*months)-loanAmount;
        return balanceLoanAmount;
    }
}
class BankAccount
{
   public static void main(String[] args)
   {
    Account ac=new Account("14/45G-B1",8008600519l,"24/10/2000");
    //SavingsAccount sa=new SavingsAccount();
    //LoanAccount la=new LoanAccount();
    //System.out.println("Name :"+ac.name+"\n"+"Account No :"+ac.accNo+"\n"+"WithDrawl Amount :"+sa.withdrawl+"\n"+"Present Balance :"+sa.presentBalance);

   }
}
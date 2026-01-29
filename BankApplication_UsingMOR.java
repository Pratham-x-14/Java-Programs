public class BankApplication_UsingMOR
{
 void main()
 {
    int choice = Integer.parseInt(IO.readln());

    switch(choice)
    {
        case 1 -> 
        {
        var name=IO.readln();
        var accNo=IO.readln();
        var amount=Double.parseDouble(IO.readln());

        SavingsAccount sa = new SavingsAccount(name,accNo,amount);
        sa.displayAccountDetails();
        sa.calculateInterest();
        }
        
        case 2 -> 
        {
        var name=IO.readln();
        var accNo=IO.readln();
        var amount=Double.parseDouble(IO.readln());

        CurrentAccount ca = new CurrentAccount(name,accNo,amount);
        ca.displayAccountDetails();
        ca.calculateInterest();
        ca.checkOverdraftLimit();
        }

        case 3 -> 
        {
        var name=IO.readln();
        var accNo=IO.readln();
        var amount=Double.parseDouble(IO.readln());
        var depositAmount=Integer.parseInt(IO.readln());

        FixedDepositAccount fa = new FixedDepositAccount(name,accNo,amount,depositAmount);
        fa.displayAccountDetails();
        fa.calculateInterest();
        }
        
    }
 }
}

class BankAccount
{
    protected String accountHolderName;
    protected String accountNumber;
    protected double balance;
    public static final String IFSC_CODE = "SBIHYD151285";

    public BankAccount(String accountHolderName,String accountNumber,double balance)
    {
        if(accountHolderName.isEmpty())
        {
            System.err.println("Account holder name cannot be empty");
            System.exit(0);
        }
        if(accountNumber.isEmpty())
        {
            System.err.println("Account number cannot be empty");
            System.exit(0);
        }
        if(balance<0)
        {
            System.err.println("Balance cannot be negative.");
            System.exit(0);
        }
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public void calculateInterest()
    {
        IO.println("Interest given by bank is 7.5%");
    }

    public void displayAccountDetails()
    {
        IO.println("Account Holder: "+ accountHolderName);
        IO.println("Account Number: "+ accountNumber);
        IO.println("Balance RS :"+ balance);
        IO.println("IFSC CODE :"+IFSC_CODE);
    }
}

class SavingsAccount extends BankAccount
{
    protected double interestRate=4.0;

    public SavingsAccount(String accountHolderName,String accountNumber,double balance)
    {
        super(accountHolderName,accountNumber,balance);
    }

    public void calculateInterest()
    {
        IO.println("Savings Account Interest RS :"+(balance*4)/100);
    }
}

class CurrentAccount extends BankAccount
{
    protected double overdraftLimit=5000.0;

    public CurrentAccount(String accountHolderName,String accountNumber,double balance)
    {
        super(accountHolderName,accountNumber,balance);
    }

    public void calculateInterest()
    {
        IO.println("Current accounts do not earn interest.");
    }
    public void checkOverdraftLimit()
    {
        IO.println("Overdraft limit RS :5000.0");
    }
}

class FixedDepositAccount extends BankAccount
{
    protected double interestRate=6.5;
    protected int depositTerm;

    public FixedDepositAccount(String accountHolderName,String accountNumber,double balance,int depositTerm)
    {
        if(depositTerm<=0)
        {
            System.err.println("Deposit term must be positive.");
            System.exit(0);
        }
        super(accountHolderName,accountNumber,balance);
        this.depositTerm=depositTerm;
    }
        @Override
        public void calculateInterest()
        {
            IO.println("Fixed Deposit Interest for 5 years RS :"+(interestRate*balance*depositTerm)/100);
        }
}
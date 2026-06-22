class BankAccount {

    private String accountNumber;
    private String holder;
    private double balance;

    private static int totalAccounts = 0;

    public BankAccount(String accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }
    public void deposit(int amt){
        if(balance>0){
            balance+=amt;
            System.out.println("Deposited");
        }
    }
    public void withdraw("int amt"){
        if(balance >0){
            balance-=amt;
            System.out.println("withdrawl completed");
        }
    }
    public void getStatement(String accountNumber, String holder, double balance){
        System.out.println("Account number:"+accountNumber);
        System.out.println("Holder Name:"+holder);
        System.out.println("Total Balance"+balance);
    }
}
public class Main {
    public static void main{
        BankAccount acc1=new BankAccount("101","Ritika",5000);
        BankAccount acc2=new BankAccount("102","Aman",8000);
        BankAccount acc3=new BankAccount("103","Joe",3000);

        acc1.deposit(1000);
        acc1.withdraw(100);
        acc1.withdraw(20);
        acc1.deposit(1000);
        acc1.deposit(500);

        acc2.deposit(1000);
        acc2.withdraw(100);
        acc2.withdraw(20);
        acc2.deposit(1000);
        acc2.deposit(500);

        acc3.deposit(1000);
        acc3.withdraw(100);
        acc3.withdraw(20);
        acc3.deposit(1000);
        acc3.deposit(500);

        acc1.getStatement();
        acc2.getStatement();
        acc3.getStatement();
    }
}
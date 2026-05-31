import java.util.Scanner;
class BankAccount {
    String name;
    int acc;
    char type;
    double balance;
    static double rate = 5.0; // Static rate of interest

    // Default Constructor
    BankAccount() {
        name = "Unknown";
        acc = 0;
        type = ' ';
        balance = 0.0;
    }
    BankAccount(String name,int acc,char type,double balance) {
        this.name = name;
        this.acc = acc;
        this.type = type;
        this.balance = balance;
    }
    void deposit(Scanner sc)
    {
    	System.out.println("Enter the Amount to be deposited");
    	int deposit=sc.nextInt();
    	balance+=deposit;
    	System.out.println("Total Balance: "+balance);
    }
    void withdraw(Scanner sc)
    {
    	char c=' ';
    	while(c!='e' || c!='E')
    	{
	    	System.out.println("Rs. 10000 should be maintaned");
	    	System.out.println("Current Balance: "+balance);
	    	System.out.println("Enter the Amount to be Withdrawn: ");
	    	double withdraw=sc.nextDouble();
	    	if((balance-withdraw)<10000)
	    	{
	    		System.out.println("Its less than Minimum Balance");
	    		System.out.println("Enter 'E' to go back to the Main Menu");
	    		System.out.println("To Withdraw different amount Enter 'R'");
	    		c=sc.next().charAt(0);
	    	}
	    	else
	    	{
	    		balance-=withdraw;
	    		System.out.println("Balance: "+balance);
	    		break;
	    	}
    	}
    	
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Name: ");
    	String name=sc.nextLine();
    	System.out.println("Enter account number: ");
    	int acc=sc.nextInt();
    	char type;
    	while(true)
    	{
    		System.out.println("Type(Savings-S,Current-C): ");
            type=sc.next().charAt(0);
        	System.out.println(type);
        	if( type=='S' || type=='C')
        	{
        		break;
        	}
        	else
        	{
        		System.out.println("Wrong Input");
        	}
    	}
    	System.out.println("Enetr Balance: ");
    	double balance=sc.nextDouble();
    	BankAccount b= new BankAccount(name,acc,type,balance);
    	char a=' ';
    	while(a!='e' || a!='E')
    	{
	    	System.out.println("****************************");
	    	System.out.println("Choose one of the Following");
	    	System.out.println("A: To Deposit Amount");
	    	System.out.println("B: To Withdraw Amount");
	    	System.out.println("C: To Display the Details of Account Holder");
	    	System.out.println("D: To Display Rate of Intrest");
	    	System.out.println("E: To Exit");
	    	System.out.println("****************************");
	    	a=sc.next().charAt(0);
	    	if(a=='A' || a=='a')
	    	{
	    		b.deposit(sc);
	    	}
	    	else if(a=='B' || a=='b')
	    	{
	    		b.withdraw(sc);
	    	}
	    	else if(a=='C' || a=='c')
	    	{
	    		//b.display();
	    	}
	    	else
	    	{
	    		System.out.println("Wrong Input");
	    	}
    	}
    }
}

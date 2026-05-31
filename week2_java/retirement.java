import java.util.Scanner;
public class retirement
{public static void main (String[] args)
 { Scanner sc= new Scanner(System.in);
        String dob;
	System.out.println("Enter Date of birth in (ddmmyyyy)");
        dob=sc.next();
        String year;
        year=dob.substring(4,8);
        int ret= Integer.parseInt(year)+60; 
        String date ;  String mon;
        date=dob.substring(0,3);
        int bday=Integer.parseInt(date);
        mon=dob.substring(3,4);
        int month=Integer.parseInt(mon);
        if(bday>10)
        { System.out.println("Retiremnt: "+bday+"/"+month+"/"+ret);}
        else 
        System.out.println("Recommended Retirement : before the last day of "+(month-1)+"/"+ret);}}

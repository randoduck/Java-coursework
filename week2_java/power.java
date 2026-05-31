import java.util.Scanner;
public class power 
{public static void main (String[] args)
 { Scanner sc= new Scanner(System.in);
        int tot=0;
	int units=0;
	 for(int i=1; i<8 ;i++)
	{System.out.println("Enter consumption for day  " + i);
	units=sc.nextInt();
	tot=tot+units;
        }

System.out.println("Total number of units consumed is " + tot);
int num =tot;
if (num<=100)
{num=1;}
else if (num<=200)
{num=2;}
else if (num>=201)
{num=3;}
System.out.println(num);
int bill=0;
switch(num)
{ case 1:      
               {bill=tot*7;
		break;}
  case 2:      
               {bill=((tot-100)*8)+(100*7);
		break;}
  case 3:      
               {bill=((tot-200)*10)+(100*8)+(100*7);
		break;}
  default:
           System.out.println("Error");
}
System.out.println("Your bill is  " + bill);
}  }
          
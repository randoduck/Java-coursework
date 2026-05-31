import java.util.Scanner;
public class diagonal  
{public static void main (String[] args)
 { Scanner sc= new Scanner(System.in);
	System.out.println("Enter order:  ");
        int size=sc.nextInt();
System.out.println("Enter num  ");
    	int arr[][]=new int[size][size];
        for(int i=0;i<size ;i++)
        { for(int j=0;j<size ;j++)
           { arr[i][j]=sc.nextInt();}}
        int sum=0;
         for(int i=0;i<size ;i++)
        { for(int j=0;j<size ;j++)
 		{if((i+j)== (size-1))
                  {System.out.println(arr[i][j]);
                    sum=sum+arr[i][j];}
		}
	}
      
        System.out.println("sum of non diagonal elements:  "+sum);}}			

 

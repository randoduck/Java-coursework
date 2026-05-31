import java.util.Scanner;
class Pgm_4
{
     public static void main(String[] args)
	{
	   Scanner sc = new Scanner(System.in);
	   int len = args.length;
	   int[] arr = new int[len];
	   int count = 0;
	   System.out.print("Enter number of places to shift: ");
	   int shift = sc.nextInt();
	   System.out.print("Enter direction (left = 1, right = -1): ");
	   int dir = sc.nextInt();
	   while ((dir*dir) != 1)
	   {System.out.print("Please enter direction correctly (left = 1, right = -1): ");
	    dir = sc.nextInt();}
	   if (dir < 0)
	   	shift = len - shift;
	   for (String a : args)
	   {
		arr[count] = Integer.parseInt(a);
		count++;
	   }
	   System.out.println("Array before shifting: ");
	   for (int a : arr)
		System.out.print(a + " ");
	   System.out.println();
	   int trunc, temp;
	   for (int i = 0; i < shift; i++)
	   {
	   	trunc = arr[0];
		for (int j = 1; j < len; j++)
		{
		   temp = arr[j];
		   arr[j] = arr[j - 1];
		   arr[j - 1] = temp;
		} 
		arr[len-1] = trunc;
	   }
	   System.out.println("Array after shifting: ");
	   for (int a : arr)
		System.out.print(a + " ");
	}
}
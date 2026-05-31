import java.util.Scanner;
class Pgm_5
{
   public static void main(String[] args)
   {
       int n, total = 0, count = 0;
       Scanner sc = new Scanner(System.in);
       n = Integer.parseInt(sc.nextLine());
       String[] stocks = new String[n];
       String Name, choice = "a";
       int[] quantity = new int[n];
       float[] price = new float[n];
       for(int i = 0; i < n; i++)
       {
	   System.out.print("Enter name of stock: ");
	   stocks[i] = sc.nextLine();
	   System.out.print("Enter price of stock: ");
	   price[i] = Float.parseFloat(sc.nextLine());
	   System.out.print("Enter quantity of stock: ");
	   quantity[i] = Integer.parseInt(sc.nextLine());
       }
       while(!choice.equals("exit")){
       System.out.println("Select which stock to buy: ");
       for(String c : stocks){
        if (quantity[count] != 0)
            System.out.print(c + " ");
        count ++;}
       System.out.println();
       Name = sc.nextLine();
       count = 0;
       boolean success = false;
       while(!success)
       {
        for(String c : stocks)
                if (Name.equals(c) && quantity[count] != 0){
                    success = true;
                    break;}
                else
                    count++;
            if(!success)
            {
                System.out.println("Entered stock not available, try again:");
                Name = sc.nextLine();
                count = 0;
            }
        }
        System.out.printf("Select amount to buy [available: %d, %f per stock]", quantity[count], price[count]);
        int amt = Integer.parseInt(sc.nextLine());
        while (amt > quantity[count])
        {
            System.out.print("Amount entered is too large, try again.");
            amt = Integer.parseInt(sc.nextLine());
        }
        quantity[count] -= amt;
        total += price[count]*amt;
        count = 0;
        System.out.println("To exit, enter exit, to buy more press enter.");
        choice = sc.nextLine();
        }
    System.out.println("Generating bill...");
    System.out.println("Total cost: " + total);
}
}
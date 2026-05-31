
public class counter 
{ static int count = 0; 
  
 counter() 
 { count++;
   System.out.println("Counter objects : " + count);} 

 static void showCount()
 {System.out.println("Total Count: " + count);} 

 public static void main(String[] args) 
{counter c1 = new counter(); 
 counter c2 = new counter(); 
 counter c3 = new counter(); 
 counter.showCount(); }}

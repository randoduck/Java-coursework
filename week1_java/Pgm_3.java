class Pgm_3
{
  public static void main(String[] args)
{
  System.out.println("Part A: ");
  partA();
  System.out.println("Part B: ");
  partB();
}

 public static void partA()
{
  int x = 10;
  double y = x;
  int y = (float) x;
  System.out.println(y);
}
 public static void partB()
{
 float x = 10.5;
 int y = x;
 System.out.println(y);
}
}

import java.util.*;
class Die{
	int sideUp;
	void roll()
	{Random rand=new Random();
        sideUp=rand.nextInt(6)+1;}

	int getsideUp()
	{return this.sideUp;}}

public class dice {
	        public static void main(String[] args) {
		Die d1=new Die();
		Die d2=new Die();
                System.out.println("Rolling the Dice................");
		d1.roll();
		d2.roll();
		System.out.println("Die 1: "+d1.getsideUp()+" Die 2: "+d2.getsideUp()+"\nSum of dice: "+(d1.getsideUp()+d2.getsideUp()));}}

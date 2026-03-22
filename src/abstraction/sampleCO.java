package abstraction;

public class sampleCO extends sampleAB{
	
	
	@Override
		public void m1() {
			System.out.println("the ovveriden method is here");
			
		}
	
	
public static void main(String[] args)
{
	sampleCO ab=new sampleCO();
	System.out.println(ab.x);
	System.out.println(ab.X);
	System.out.println(ab.name);
	ab.m1();
	ab.m10();
	System.out.println(sampleAB.j);
}
}

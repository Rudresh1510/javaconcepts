package inheritance;

public class child2hr extends parent1hr {

	
	public void m6() {
		System.out.println("i have my own 4 cars");
	}
	
	public void m5() {
		
		System.out.println("i have my own silver");
	}
	
	public static void main(String[] args)
	{
		child1hr c=new child1hr();
		c.m1();
		c.m2();
		c.m3();
		c.m7();
		c.m4();
		
		
		System.out.println("---------------------------------------------");
		
		child2hr hr=new child2hr();
		hr.m1();
		hr.m2();
		hr.m3();
		hr.m5();
		
		hr.m6();
	}

	
	
	
	
	
	
}

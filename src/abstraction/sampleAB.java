package abstraction;

public abstract class sampleAB {

	int x = 19;
	int X = 37;
	String name;
	static String j = "ajay";

	public sampleAB() {

		name = "rudresh";

	}

	public abstract void m1();

	static {

		System.out.println("i am static");

	}

	{

		System.out.println("i am block");
	}
	static {
		{
			System.out.println("i local");

		}
	}

	private void m2() {
		System.out.println("i am concret");

	}

	public void m10() {
		m2();
		System.out.println("i am also concret");

	}

}

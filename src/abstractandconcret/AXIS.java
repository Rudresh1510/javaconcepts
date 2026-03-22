package abstractandconcret;

public class AXIS extends RBI {
	
	
	@Override
	public void m1() {
		System.out.println("create the axis account");
		
	}
	 void m3() {
		System.out.println("it my own axis method");

	}
//	static {
		
	//	System.out.println("i am the static of AXIS");
//	}
	
	
	public static void main(String[] args) {
		
		
		AXIS b=new AXIS();
		b.m1();
		b.m2();
		b.m3();
		
	}

}

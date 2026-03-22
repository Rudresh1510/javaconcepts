package InterFace;

public class Test implements I1,I2 {

	@Override
	public int m1() {
		return 10+22;
		
	}

	@Override
	public void m2() {
	System.out.println("this is I1 method");
		
	}
	@Override
	public void m3() {
		System.out.println("this is concret of I2");
		I1.super.m3();
		
	}
	
	

	public static void main(String[] args) {
		Test t=new Test();
	int	f=t.m1();
	System.out.println(f);
		t.m2();
		System.out.println(I1.x);
		t.m3();
		I2.m4();
		t.m13();
	
		
		
		
		
		
		
		
		
	}
	
	
	
}

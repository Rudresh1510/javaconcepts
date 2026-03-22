package abstractandconcret;

public class HDFC extends RBI {
	
	@Override
	public void m1() {
	  System.out.println("create the accountof HDFC");
		
	}
	public void m6() {
		
		System.out.println("it is my hdfc own method");
	}
	
	//static {
	//	System.out.println("i am the static of HDFC");
	//}
	
public static void main(String[] args) {
	HDFC hd=new HDFC();
	hd.m1();
	hd.m6();
}
}

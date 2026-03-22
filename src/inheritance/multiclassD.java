package inheritance;

public class multiclassD extends multiclassC{
int n=19944;
	
	{
		System.out.println("i am the block of class D");
	}
	
	static {
		
		
		System.out.println("i am the static method of block D");
	}
	
	public  void m4() {
		System.out.println("i am the method of m4 ");
	}
	public static void main(String[] args) {
		
		multiclassC dd=new multiclassC();
		System.out.println(dd.t);
		System.out.println(dd.z);
		System.out.println(dd.c);
		System.out.println(dd.z);
		dd.m1();
		dd.m2();
		dd.m3();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

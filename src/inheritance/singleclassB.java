package inheritance;

public class singleclassB extends singleclassA {

	
	 void m2() {
		System.out.println("i am the method of m2");

	}
	
	
	
	
	public static void main(String[] args) 
	{
		singleclassB b=new singleclassB();
		System.out.println(b.x);
		b.m1();
		b.m2();
	}
}


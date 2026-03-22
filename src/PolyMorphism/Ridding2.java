package PolyMorphism;

public class Ridding2 extends Ridding1 {

	@Override
	public String m1(String name) {
		
		return super.m1(name);
	}
	
@Override
protected int m2(int year) {
	
	return super.m2(year);
}
	@Override
	void m3() {
		
		System.out.println(("here we change the value"));
	}
	public static void main(String[] args) {
		
		Ridding2 r=new Ridding2();
		String s = r.m1("rudresh");
		int i = r.m2(2001);
		r.m3();
		
		System.out.println(s);
		System.out.println(i);
	}
	
}

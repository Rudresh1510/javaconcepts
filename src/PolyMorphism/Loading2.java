package PolyMorphism;

public class Loading2 extends Loading1
{
public static void main(String[] args) {
		
		Loading1 l=new Loading1();
		l.m1(12);
		int f=l.m2(6, 10);
		System.out.println(f);
		int m = Loading1.m4(10, 7);
		System.out.println(m);
		
	}
}

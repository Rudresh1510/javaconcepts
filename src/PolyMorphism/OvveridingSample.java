package PolyMorphism;

public class OvveridingSample {
int rollnum;
String name;

@Override
	public String toString() {
		 return "["+rollnum+"="+name+"]";
	}

public OvveridingSample(int rollnum, String name) {
	super();
	this.rollnum = rollnum;
	this.name = name;
}
public static void main(String[] args) {
	
	OvveridingSample rudresh=new OvveridingSample(10 ,"rudresh");
	OvveridingSample aishwarya=new OvveridingSample(11 ,"aishwarya");
	
	System.out.println(rudresh);
	System.out.println(aishwarya +" this is the name");
	
	
}























}

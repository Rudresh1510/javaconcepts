package InterFace;

public interface I1 {
	
	   int x=78;   // final //public //static

	public int m1();
	
    public void m2();
    
    
    
    default void m3() {
    	
    	System.out.println("this is the m3 method of I1");
    }
	
    private void m10() {
    	
    	
    	System.out.println("this is for internal use");
    }
 default public void m13() {
	 
	 m10();
	 System.out.println("hello private");
	 
 }
	
	
}


//we can write the variable in interface which is final,public and static
//here also this is for internal use of private access modifier
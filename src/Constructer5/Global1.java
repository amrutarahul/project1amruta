package Constructer5;

public class Global1 {
	 int a=10; // global variable non static 
	 static int b=50;  // global variable static
	 
	

	public static void main(String[] args) {
		Global1 gl=new Global1();
		gl.Test1();
		Test2();
		System.out.println("value of a is"+gl.a); //non s from same class
		System.out.println("value of b is"+b); // static from same class
		
		// non s another class
		Ganother yo=new Ganother();
		System.out.println( "value of is "+yo.r);
		//s another class
		System.out.println("value of is "+Ganother.s); 
		
		 int sub1=400-gl.a;
		 System.out.println("sub is "+sub1);
		
		
		
		

	} 
	public void Test1() // non static
	{
		int add=a+10; //we can call non static global
		 int sum=b-10;  //we can call  static global 
		 System.out.println("add is"+add);
		 System.out.println("sum is "+sum);
		
	}
	public static void Test2() // static
	{
		//int  add=a+10; 	//we can't call non static global
         int  sum=b-10;    //we can call  static global
         System.out.println("sum is"+sum);

	}
	

}

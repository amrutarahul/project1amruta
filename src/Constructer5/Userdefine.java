package Constructer5;

public class Userdefine {
	
	public Userdefine()//without parameter(zero parameter)
	{
	System.out.println("hi i am construter method");
	}
	

	public static void main(String[] args) {
		Userdefine ud=new Userdefine();
		ud.add();
		
		
		// TODO Auto-generated method stub

	}
	public void add() {
		int a;
		int b;
		a=57;
		b=78;
		int addition=a+b;
		System.out.println("addition is"+addition);
	    System.out.println("hi i am userdefine method");
	
	
	}

}
      
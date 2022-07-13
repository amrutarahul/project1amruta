package Thiskeywordsuperkeyword;

public class Superuse extends Thisuse
{
	
	int a=5;  //global variable
	

	public static void main(String[] args) {
		Superuse s=new Superuse();
		s.sub();
		

	}
	public void sub() {
		
		int a=12; // local variable
		int b=8;
		int sub=a-b;
		System.out.println("sub is"+sub);
		 int sub1=super.a-b;
		 System.out.println("sub1 is"+sub1);
		 
	}

}

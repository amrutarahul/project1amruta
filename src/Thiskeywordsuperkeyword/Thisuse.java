package Thiskeywordsuperkeyword;

public class Thisuse {
	int a=19; // global variable
	

	public static void main(String[] args) {
		
		Thisuse th=new Thisuse();
		th.add();
		

	}
	public void add() {
		 int a=10; //local variable
		int  b=20;
		int sum=a+b;
		
		 System.out.println("sum is"+sum);
		 int sum1=this.a+b;
		 System.out.println("sum1 is"+sum1);
	}

}

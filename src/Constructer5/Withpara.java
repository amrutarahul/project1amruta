package Constructer5;

public class Withpara {
	int a; //global variable
	int b;
	 
	public Withpara(int x,int y) {
		a=x;
		b=y;
		
		
	}

	
	public static void main(String[] args) {
		Withpara amruta=new Withpara(23,78);
		amruta.mul();
		Withpara pushpa=new Withpara(10,10);
		pushpa.mul();
		Withpara krutika=new Withpara(8,7);
		krutika.mul();


		
		
		
		

	}
	public void mul() {
		System.out.println("multification is "+(a*b));
	}
	
	

	
}

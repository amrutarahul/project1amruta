package Polimervism;

public class Methodoverloading {

	public static void main(String[] args) {
		Methodoverloading me=new Methodoverloading();
		me.add();
		me.add(700, 900);
		me.add(900, 800, 700);

	}
	
	public void add() {
		int a=10;
		int b=12;
		int sum=a+b;
		System.out.println("sum is"+sum);
	}
	public void add(int a,int b) {
		
		int sum=a+b;
		System.out.println("sum is"+sum);
	}
	public void add( int a,int b,int c) {
		
		int sum=a+b+c;
		System.out.println("sum is"+sum);
	}

}

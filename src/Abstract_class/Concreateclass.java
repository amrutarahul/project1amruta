package Abstract_class;

public class Concreateclass extends Abstractstudy{

	public static void main(String[] args) {
		Concreateclass co=new Concreateclass();
		co.test();
		co.sample();
		co.test1();
		co.test2();

	}
	
	public void test()
	{
		System.out.println("this method in complete in cc");
	}
	public void sample() 
	{
		System.out.println("this is one method of cc");
	}

}

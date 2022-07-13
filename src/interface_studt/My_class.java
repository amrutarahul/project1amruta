package interface_studt;

public class My_class implements Myinterface {

	public static void main(String[] args) 
	{
		My_class mc=new My_class();
		mc.test();
		mc.test1();
		mc.mymethod();
		//  a=a+10; we cant variable update fron interface
		System.out.println("value of is"+a);
		

	}

	@Override
	public void test()
	{
		System.out.println("hi this is method completed in implementation class");
	}

	@Override
	public void test1() 
	{
		System.out.println("hi this is method completed in implementation class");

	}
	public void mymethod()
	{
		System.out.println("this is my class method");
	}

}

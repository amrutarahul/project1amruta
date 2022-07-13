package interface_studt;

public interface Father
{
  void phone();
  void laptop();
  default void money()
  {
	  System.out.println("father money");
  }
  static void test()
  {
   System.out.println("Father test");
  }
  

  

  
}

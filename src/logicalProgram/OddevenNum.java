package logicalProgram;

import java.util.Scanner;

public class OddevenNum {

	public static void main(String[] args) 
{
   // System.out.println(10/2);
   // System.out.println(10%2);
	
	Scanner sc= new Scanner(System.in);
  System.out.println("pls enter value");
  int a = sc.nextInt();
   if(a%2==0)
   {
	   System.out.println("Number is even number");
   }
   else
   {
	   System.out.println("Number is odd number");  
   }
}
}

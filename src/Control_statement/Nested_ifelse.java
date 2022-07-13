package Control_statement;

public class Nested_ifelse {

	public static void main(String[] args) {
//     if username is correct--->enter password
//     {
//	
//	   if--> password is correct--> login success
//	   else-->enter correct password
//		
//	   }
//    else-->enter correct username
		 String UN="Facebook";
		 String PWD="Amruta123";
		 
		 if(UN=="Facebook") {
			 System.out.println("enter password");
			 if(PWD=="Amruta123") {
			 System.out.println(" login success");
			 } else {
				 System.out.println( "password is incorrect");
			 }
	     }
		 else {
			System.out.println("pls  enter correct username");
		}
	
			 
		 }
				 
	}




package Constructer5;

public class Employe {
	//name,monumber,id,salary,dept,gender
      String  emp_name;
      long emp_monumber;
      int emp_id;
      float emp_sal;
      char emp_gender;
      String emp_dept;
      
      
      
	public static void main(String[] args) {
 Employe amruta=new Employe();
  amruta.emp_name="amruta sasankar";
  amruta.emp_monumber=1234567890;
  amruta.emp_id=21;
  amruta.emp_sal=15000;
  amruta.emp_gender='f';
  amruta.emp_dept="imnfosis";
  
  amruta.emp_info();
  
  
  
  
 
		// TODO Auto-generated method stub

	}
	public void emp_info() {
		
		System.out.println("=============================");
        System.out.println("employe name is "+emp_name);
		System.out.println("employe monumber is "+ emp_monumber);
		System.out.println("employe id is "+emp_id);
		System.out.println("employe salary is "+emp_sal);
		System.out.println("employe deparment is "+emp_dept);
		System.out.println("employe gender is "+emp_gender);
		System.out.println("=============================== ");

		}
	

}

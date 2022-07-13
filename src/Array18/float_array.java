package Array18;

public class float_array {

	public static void main(String[] args) {
		

        //Array declaration
		float mobile_price[]=new float[5];
		
		//array assign value
		mobile_price[0]=1200.0f;
		mobile_price[1]=1300.0f;
		mobile_price[2]=1400.0f;
		mobile_price[3]=4500.7f;
		mobile_price[4]=7899.9f;
		
		//USAGE
		
		System.out.println(mobile_price[0]);
		 System.out.println("==================");

		 for (int i=0; i<=2; i++)
		{
			System.out.println(mobile_price[i]);
		}
		 System.out.println("==================");

		
		for (int i=0;i<=mobile_price.length-1;i++)
		{
			System.out.println(mobile_price[i]);

		}
		 System.out.println("==================");

		
		for (int i=mobile_price.length-1;i>=0;i--)
		{
			System.out.println(mobile_price[i]);

		}
		 System.out.println("==================");





	

	}

}

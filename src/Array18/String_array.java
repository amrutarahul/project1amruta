package Array18;

public class String_array {

	public static void main(String[] args) {
		    //string array
			//array declaration
			 String village[]=new String[4];
			 
			 //array initialization village
				 //array initialization
				 village[0]="borgaw";
				 village [1]="khari";
				 village[2]="ramakona";
				 village[3]="umranala";
				 //name[-1]="sausar";
				 
				// usage
				 System.out.println("==================");
				 System.out.println( village[0]);
				 System.out.println(village[1]);
				 System.out.println(village[2]);
				 System.out.println(village[3]);
				 System.out.println("==================");
				 
				 for (int i=0; i<=2; i++)
				 {
					 System.out.println(village[i]);
				 }
				 System.out.println("==================");

				for (int i=0;i<=village.length-1;i++)
				 {
					System.out.println(village[i]);
				 }
				 System.out.println("==================");
				 
				for (int i=village.length-1;i>=0;i--)
				{
					System.out.println(village[i]);
				}
				 System.out.println("==================");
				 

	}

}

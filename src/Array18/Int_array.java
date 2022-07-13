package Array18;

public class Int_array {

	public static void main(String[] args) {

        //Array declaration
		int rollnum[]=new int[5];
		
		//array assign value
		rollnum[0]=11;
		rollnum[1]=12;
		rollnum[2]=13;
		rollnum[3]=14;
		rollnum[4]=15;
		
		//USAGE
		
		System.out.println(rollnum[0]);
		 System.out.println("==================");

		 for (int i=0; i<=2; i++)
		{
			System.out.println(rollnum[i]);
		}
		 System.out.println("==================");

		
		for (int i=0;i<=rollnum.length-1;i++)
		{
			System.out.println(rollnum[i]);

		}
		 System.out.println("==================");

		
		for (int i=rollnum.length-1;i>=0;i--)
		{
			System.out.println(rollnum[i]);

		}
		 System.out.println("==================");





	

	}

}

package patternProgram;

public class Eg10 {

	public static void main(String[] args) {
	
//           * * * *
//            * * * 
//             * *
//              *
	// row=4 
    int space=0;
	int star=4;
for(int i=1;i<=4;i++) 
{
	for(int j=1;j<=space;j++)
	{
	 System.out.print(" ");
 	}
	for(int j=1;j<=star;j++)
	{
	 System.out.print("* ");
 	}
	 System.out.println();
     star--;
     space++;
	}
	}

}
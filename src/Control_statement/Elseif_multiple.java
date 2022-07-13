package Control_statement;

public class Elseif_multiple {

	public static void main(String[] args) {
    //if your  per >=70%--> you are in dist
	//else if per >=65% <70%--> you are in 1st class
	//else if per >=50% <60%--> you are in 2nd class
	//else if per>=40% <50%--> you are just class
	//else -->you are fail	
   
		int per =45;
		if (per>=70) {
			System.out.println("you are in dist");
			
		}
		else if (per>=65 &per<70) {
			System.out.println("you are in 1st class");
			
		}
		else if (per>=50 & per<60) {
			System.out.println("you are 2nd class");
			
		}
		else if (per>=40 & per<50) {
			System.out.println("you are just pass");
			
		}
		else {
			System.out.println("you are fail");
		
		}

	}

}

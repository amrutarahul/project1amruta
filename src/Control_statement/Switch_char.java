package Control_statement;

public class Switch_char {

	public static void main(String[] args) {
         char grade='A';
         
         switch (grade) {
		case 'A':System.out.println("you are 1st grade marks");
				break;
		case'B':System.out.println("you are 2nd grade marks");
		        break;
		case'c':System.out.println("you are 3rd grade marks");  
		         break;
		case'D':System.out.println("you are 4th grade avg marks");
		          break;
		default:System.out.println("you are marks betweem A-D");
			break;
		}
         
         
	}

}

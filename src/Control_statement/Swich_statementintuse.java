package Control_statement;

public class Swich_statementintuse {

	public static void main(String[] args) {
		//Day  1--> week in  a 1st of sun
		//Day  2--> week in  a 2nd of mon
		//Day  3--> week in  a 3rd of tue
		//Day  4--> week in  a 5th of wed
		//Day  5--> week in  a 5th of thu
		//Day  6--> week in  a 6th of fri
		//Day  7--> week in  a 7th of sat
		
           int Day=5;
           
           switch (Day) {
		case 1:System.out.println("week in a 1st day of sunday");
			 break;
		case 2:System.out.println("week in a 2nd day of monday");
			 break;
		case 3:System.out.println("week in a 3rd day of tuesday");	 
             break;
		case 4:System.out.println("week in a 4th day of wendesday");
		     break;
		case 5:System.out.println("week in a 5th day of thrusday");
		     break;
		case 6:System.out.println("week in a 6th day of friday");
		     break;
		case 7:System.out.println("week of a 7th day of saturday");
		     break;
		default:System.out.println("pls enter your day between 1-7");
			break;
		}





	}

}

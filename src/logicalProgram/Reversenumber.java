package logicalProgram;

public class Reversenumber {

	public static void main(String[] args) {
		int num=123;
		String strnum = Integer.toString(num);
         String rev = "";
         
         for(int i=strnum.length()-1;i>=0;i--)
         {
        	rev =rev+strnum.charAt(i); 
         }
         int revnum=Integer.parseInt(rev);
         
         System.out.println("Orginal num is"+num);
         System.out.println("reverse num is"+revnum);
	}

}

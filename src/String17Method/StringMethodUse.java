package String17Method;

public class StringMethodUse {

	public static void main(String[] args)
	{
		//length()method use
		String name="Velocity";
		System.out.println(name.length());
		
		int leghtOfString=name.length();
		System.out.println(leghtOfString);
		
		//toUpper case method use
		System.out.println(name);
		System.out.println(name.toUpperCase());
		String m=name.toUpperCase();
		System.out.println(m);
		
		//toLowercase method use'
		System.out.println(name.toLowerCase());
		System.out.println(m.toLowerCase());
		String n=m.toLowerCase();
		System.out.println(n); 
		
		//equals()method use
		//(b==a)compare memory location for two operands
        String a="Velocity";
		String b="Velocity";
		String c=new String("Velocity");
		String d=new String("Velocity");
		String e=new String("VELOCITY");
		System.out.println(a==b);
		System.out.println(b==d);
		System.out.println("==========================");
		System.out.println(a.equals(b));
		System.out.println(b.equals(c));
		System.out.println(a.equals(d));
		
	    boolean result = a.equals(c);
		System.out.println("a and c are equal==+ result");
		System.out.println(d.equals(e));//checking character sequence along with case sensitivity);
		
		//equlsIgnorecase()method use
		String city="pune";
		String locality="pune";
		String dist="pune";
		System.out.println(city.equals(locality));
		System.out.println(city.equalsIgnoreCase(dist));
		System.out.println("=============================");
		
		//contains()method use
		String k="katraj";
		System.out.println(k.contains("ka"));
		System.out.println(k.contains("kr"));
		
		//isEmpty method use
		String p="Test";
		String q="";
		String r="null";
		String s="";
		System.out.println(q.length());
		//System.out.println(r.length());
		//System.out.println(p.length());
		
		System.out.println("=====================");
        System.out.println(p.isEmpty());
		System.out.println(q.isEmpty());
		System.out.println(r.isEmpty());
		System.out.println(s.isEmpty());
		System.out.println("=====================");
		
		System.out.println("=====================");
        System.out.println(p.isBlank());
		System.out.println(q.isBlank());
		System.out.println(s.isBlank());
		System.out.println("=====================");
		
		//charAT METHOD USE
		System.out.println("====================");
		String country="INDIA";
		System.out.println(country.charAt(0));
		char requierdchar=country.charAt(4);
		System.out.println(requierdchar);
		//country.charAT(-1);//EXCEPETION
		System.out.println("====================");
		
		//endWITH METHOD USE
		System.out.println("====================");
		System.out.println(country.endsWith("IND"));
		System.out.println(country.endsWith("IA"));
		System.out.println(country.endsWith("A"));
		System.out.println("====================");
		
		//startWith METHOD USE
		System.out.println("====================");
		System.out.println(country.startsWith("INDIA"));
		System.out.println(country.startsWith("IA"));
		System.out.println(country.startsWith("A"));
		
		System.out.println(country.startsWith("A",4));
		System.out.println(country.startsWith("IN",0));
        System.out.println("====================");
        
        //subString method use
        System.out.println("====================");
        String testing="VELOCITY CORPORATE TRAINING CENTER";
        String resultString=testing.substring(28);
        System.out.println(resultString);

        System.out.println(testing.substring(9,18));
        System.out.println("====================");
        
        //conCat method use
        System.out.println("====================");
        String x="pune";
        String y="city";
        System.out.println(x.concat(y));
        System.out.println(x.concat(y).concat("katraj"));
        System.out.println("====================");

        //index of method use
        System.out.println("====================");
        String state="Maharashtra";
        System.out.println(state.indexOf('a'));
        System.out.println(state.indexOf('a',4));
        System.out.println("====================");

        //lastIndex of method use
        System.out.println("====================");
        System.out.println(state.lastIndexOf('a'));
        System.out.println("====================");
        


        



        
        		
         



		








		
		
		



		


		
		
		
		

		




		
		

	}

}

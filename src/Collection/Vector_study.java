package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_study {

	public static void main(String[] args) {
		
	
	 Vector v = new  Vector();
	  v.add("pune");
	  v.add('M');
	  v.add("pune");
	  v.add(null);
	  v.add(null);
	  v.add(123);
	  v.add(12.23);
	  v.add(true);
	  
	  System.out.println(v);
	  System.out.println(v.size());
	  System.out.println(v.isEmpty());
	  System.out.println(v.remove(1));
	  System.out.println(v);
	  System.out.println(v.get(3));
System.out.println("====================================================================");	  
	  for(int i=0;i<=v.size()-1;i++)
	  {
       System.out.println(v.get(i));
	  }
System.out.println("====================================================================");	  

    for(Object k:v)
    {
    	System.out.println(k);
    }
 System.out.println("====================================================================");	  
   
 Iterator rit = v.iterator();
 while(rit.hasNext())
	 {
	 System.out.println(rit.next());
     }
 System.out.println("====================================================================");	  
 
  ListIterator litr = v.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
System.out.println("====================================================================");	  
	
Enumeration tir = v.elements();	
		while(tir.hasMoreElements())
		{
		System.out.println(tir.nextElement());
		}
System.out.println("====================================================================");	  

		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

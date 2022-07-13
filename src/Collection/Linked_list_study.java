package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked_list_study {

	public static void main(String[] args) {
           
		LinkedList ll = new LinkedList();
	      ll.add("pune");
	      ll.add('M');
	      ll.add("pune");
	      ll.add(null);
	      ll.add(null);
	      ll.add(123);
	      ll.add(12.23);
	      ll.add(true);
	      
	      System.out.println(ll);
   System.out.println(ll.size());
   System.out.println(ll.isEmpty());
   System.out.println(ll.remove());
   System.out.println(ll.peek());
     System.out.println(ll);
 System.out.println(ll.poll());
	System.out.println(ll);
	System.out.println(ll.pop());
	System.out.println(ll.get(3));
	
System.out.println("======================================================================================");	
	      for(int i=0;i<=ll.size()-1;i++)
	{
	      System.out.println(ll.get(i));
	}
System.out.println("======================================================================================");	
	
	for(Object kk:ll)
	{
	     System.out.println(kk);
	}

System.out.println("======================================================================================");	
	
	      Iterator ut = ll.iterator();
	      while(ut.hasNext())
	{
	       System.out.println(ut.next());
	}
 System.out.println("======================================================================================");	

	ListIterator lit = ll.listIterator();
	
	while(lit.hasNext())
	{
		System.out.println(lit.next());
	}
System.out.println("======================================================================================");	
	
	}
       	}
	        
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

		
	
	
	
	
	
	



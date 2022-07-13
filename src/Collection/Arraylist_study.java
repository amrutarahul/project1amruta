package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist_study {


  public static void main(String[] args) {
	
	 ArrayList al = new ArrayList();
       al.add("Velocity");
       al.add('A');
       al.add("Velocity");
       al.add(123);
       al.add(null);
       al.add(null);
       al.add(123.13);
       al.add(true);
       
		
	System.out.println(al);	
	System.out.println(al.size());	
	System.out.println(al.isEmpty());	
	System.out.println(al.contains("Velocity"));	
	System.out.println(al.get(2));
	System.out.println(al.indexOf('A'));
	System.out.println(al.remove(2));
	System.out.println(al);	
	al.add(2,"pune");
	System.out.println(al);	
	
 System.out.println("=====================================================");
    for(int i=0;i<=al.size()-1;i++)
        {
	       System.out.println(al.get(i));
         }
 System.out.println("====================================================");
    
    Iterator it = al.iterator();
         
    while(it.hasNext())
         {
            System.out.println(it.next());
         }
System.out.println("======================================================");
      
     ListIterator lit = al.listIterator();
		
	  while(lit.hasNext())	
	  {
		 System.out.println(lit.next()); 
	  }
System.out.println("======================================================");
		
      for(Object h:al)
		{
			System.out.println(h);
		}
System.out.println("======================================================");
	
  ArrayList<Integer>at=new ArrayList<>();
  
  at.add(1);
  at.add(3);
  at.add(4);
  at.add(6);
  
  for(Integer k:at) 
  {
	System.out.println(k);  
  }
System.out.println("======================================================");
 
ArrayList<Character>ab=new ArrayList<>();
     ab.add('A');
     ab.add('B');
     ab.add('C');
     ab.add('D');
  Iterator<Character> rt = ab.iterator();
 while(rt.hasNext())
 {
	 System.out.println(rt.next());
 }
 }

	
	
	
	
	
	
	
	
	
	}




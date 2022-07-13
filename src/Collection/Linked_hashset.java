package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_hashset {

	public static void main(String[] args) {
 
		LinkedHashSet uh=new LinkedHashSet();
	      uh.add("pune");
	      uh.add('A');
	      uh.add("pune");
	      uh.add(123);
	      uh.add(12.89);
	      uh.add(null);
	      uh.add(null);
	      uh.add(true);

         System.out.println(uh);
	System.out.println(uh.contains(8));
	System.out.println(uh.isEmpty());
	System.out.println(uh.size());
	System.out.println(uh.clone());
	
System.out.println("==================================================================================================");	
	
    for(Object kl:uh)
	  {
		System.out.println(kl);
	  }
System.out.println("==================================================================================================");	
	
  Iterator hj= uh.iterator();
	while(hj.hasNext())
	{
		System.out.println(hj.next());
	}
System.out.println("==================================================================================================");	
	
	//for(int i=0;i<=uh.size()-1;i++) not support
	//{
	//System.out.println(uh.ge);
//	}
	
System.out.println("==================================================================================================");	
	
	LinkedHashSet<Integer>jkl=new LinkedHashSet<>();
	 jkl.add(78);
	 jkl.add(8);
	 jkl.add(7);
	 jkl.add(708);

System.out.println(jkl);

for(Integer jk:jkl) 
{	   
   System.out.println(jk);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

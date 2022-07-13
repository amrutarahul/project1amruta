package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset_study {

	

	public static void main(String[] args) {
         HashSet hs=new HashSet();
		hs.add("pune");
		hs.add("pune");
		hs.add(null);
		hs.add(null);
		hs.add(123);
		hs.add(12.34);
		hs.add(true);
		hs.add('A');

        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs.contains('A'));

 System.out.println("==============================================================================");	
	//	for(int i=0;i<=hs.size()-1;i++)    not support in loop
	//	{
	//		System.out.println(hs);
	//	}
System.out.println("==============================================================================");	
		
      for(Object hk:hs)
		{
		System.out.println(hk);
		}
		
System.out.println("==============================================================================");	
		
		Iterator hu = hs.iterator();
		while(hu.hasNext())
		{
		   System.out.println(hu.next());
		}
System.out.println("==============================================================================");	
		
		HashSet<Integer>de=new HashSet<>();
              de.add(23);
              de.add(3);
              de.add(2);
              de.add(239);
       for(Integer jk:de) 
       {	   
          System.out.println(jk);
       }
 System.out.println("==============================================================================");	

		HashSet<String>gh=new HashSet<>();
		 gh.add("dev");
		 gh.add("aadi");
		 gh.add("pawni");
		 gh.add("suraj");
		 gh.add("devyani");

		Iterator hg=gh.iterator();
		while(hg.hasNext())
		{
			System.out.println(hg.next());
		}
System.out.println("==============================================================================");	
		
		
		
		
	}}



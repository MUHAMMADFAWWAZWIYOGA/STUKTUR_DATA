package pekan1;

import java.util.ArrayList;

public class pekan1_5 {
	
	
	
	public static void main (String [] pratiku) {
		
		ArrayList<String> a1 = new ArrayList<> ();
		                           
				a1.add("saya");
				a1.add("infromatika");
				a1.add(1, "infromatika");
				
				for ( int i= 0 ;i  < a1.size () ; i ++)
					
				{System.out.print(a1.get(i) + "") ;}
				System.out.println ();
				
				for ( String str :a1) ;
				String str = null;
				System.out.print(str + "");
				System.out.println () ;
				
				System.out.println(" initial arraylist" + a1);
				
				a1.remove(1);
				System.out.print("after teh index removal" + 1);
				
				a1.remove("saya");
				System.out.print("after object removal" + a1);
				}
	}
	
	

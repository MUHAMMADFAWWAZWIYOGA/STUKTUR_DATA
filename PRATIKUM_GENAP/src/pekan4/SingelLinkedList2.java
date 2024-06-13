package pekan4;

import java.util.LinkedList;


public class SingelLinkedList2 {
	public static void main (String [] args) {
		LinkedList<Integer> list = new
		LinkedList<Integer> ();
		list.add(42);
		list.add(-3);
		list.add(17);
		System.out.println("LinkedList:" + list);
		Object [] a = list.toArray ();
		System.out.println( "after converted LInkedList to Array :");
		for (Object element : a)
			System.out.println(element + "");
	}

	public SingelLinkedList2() {
		// TODO Auto-generated constructor stub
	}

}

package ctstraining;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		LinkedList<String> list =new LinkedList();
		list.add("Hello");
		list.add("To");
		list.add("Java");
		list.add("Batch");
		list.add("7");
		list.add("true");
		
		ListIterator<String> it=list.listIterator();
				System.out.println("***** forward Direction****");
		while(it.hasNext()) {
			String element=it.next();
			System.out.println(element);
			if(element.equals("java")) {
				break; }
			}
			
			
	    System.out.println("***** backword Direction****");
	    while(it.hasPrevious()) {
		String element=it.previous();
		System.out.println(element);
	    }
		System.out.println("The object at index 2 is:"+list.get(2));
			
			
		
		
		/*System.out.println(list);
		list.remove(2);
		list.add(2,"Advanced java");
		System.out.println("list size" +list.size());
		System.out.println("list contains python?"+list.contains("python"));
		for(String obj : list)
		{
			if(obj.contentEquals("Java")) {
				break;
			}
			System.out.println(obj); */
		
		}	
	
}
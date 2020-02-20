//Hashset and linkedhsaset
package ctstraining;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.TreeSet;

public class ArrayLinkList {
	public static void main(String[] args) {
		//LinkedList<String> list =new LinkedList();
		TreeSet<String> set=new TreeSet<>();
		set.add("Hello");
		set.add("To");
		set.add("Java");
		set.add("Batch");
		set.add("Batch");
		set.add("Batch");
		set.add("7");
	    set.add("true");
	    /*list.addFirst("start");
	    list.addLast("End");*/
	    Iterator<String> it=set.iterator();
	    while(it.hasNext())
	    {
	    	String element=it.next();
	    	System.out.println(element);
	    }
	    
	}}
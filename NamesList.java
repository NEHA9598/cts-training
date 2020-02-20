package ctstraining;

import java.util.ArrayList;

public class NamesList{
	public static void main(String[] args) {
		
		ArrayList<String> list =new ArrayList();
		list.add("Hello");
		list.add("To");
		list.add("Java");
		list.add("Batch");
		list.add("7");
		list.add("true");
		
		
		Collections.sort
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			String element=it.next();
			System.out.println(element);
		}
	}
}
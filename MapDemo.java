package ctstraining;
//import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapDemo{

	public static void main(String args[]) {
		TreeMap<String,String> map=new TreeMap<>();
		//Hashtable<String,Integer> map=new Hashtable<>();
		//HashMap<String,Integer> map=new HashMapMap<>();
		map.put("Banana","35");
		map.put("orange","60");
		map.put("Mango","100");
		map.put("Grapes","2000");
		map.put("watermelon","200");
		map.put("orange","70");
		//map.put("null",0);
		//map.put("water",null); hashtable doesnot allow null value or key. Where hashmap allows.
		System.out.println(map);
		
		for(Entry<String,String> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+"-->"+entry.getValue());
		}
		
	}
}

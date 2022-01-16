package HashMapExample;
import java.util.*;
public class CompareHashMap {
	public static void main(String args[])
	{
		HashMap<Integer,String> map1=new HashMap<>();
		map1.put(1,"a");
		map1.put(2,"b");
		map1.put(3, "c");
		
		
		
		HashMap<Integer,String> map2=new HashMap<>();
		map2.put(3,"c");
		map2.put(1,"a");
		map2.put(2, "b");
		
		
		HashMap<Integer,String> map3=new HashMap<>();
		map3.put(3,"c");
		map3.put(1,"a");
		map3.put(2, "b");
		map3.put(3,"d");
		map3.forEach((k,v)->System.out.println(k+"---"+v));
		
		System.out.println(map1.equals(map2));
		System.out.println(map1.equals(map3));
		
		//compare with keyset
		System.out.println(map1.keySet().equals(map3.keySet()));
	
		//Find out the extra key 
		HashSet<Integer> map4=new HashSet<>(map3.keySet());
		map4.addAll(map4);
		map4.removeAll(map3.keySet());
		
		
	}
}

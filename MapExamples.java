package myAdjnOfficePractice;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {
	public static void main(String[] args) {
		Map<Integer, String> hmap= new HashMap<Integer, String>();
		 hmap.put(1	, "nikunj");
		 hmap.put(2	, "mayank");
		 hmap.put(3	, "divyesh");
		 hmap.put(4	, "ravi");
		 hmap.put(5	, "kishan");
		 System.out.println("----traversing map using for loop:-----");
		 for (Map.Entry<Integer, String> intStr : hmap.entrySet()) {
			 System.out.print(intStr.getKey()+":");
			 System.out.println(intStr.getValue());
		}
		System.out.println(hmap);
		hmap.put(new Integer(1), "nilesh");
		hmap.put(new Integer(6), "sanju");
		System.out.println(hmap);
		hmap.remove(6);
		System.out.println(hmap);
		System.out.println("if map contains key 4: "+hmap.containsKey(4));
		System.out.println("if map contains value nilesh: "+hmap.containsValue("nilesh"));
		System.out.println("the entry map is: "+hmap.entrySet());
		
		Map<Integer, String> hmap1=new HashMap<Integer, String>();
		hmap1.putAll(hmap);
		System.out.println(hmap1.keySet());
		
		
		
		
	}

}

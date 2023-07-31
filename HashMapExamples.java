package myAdjnOfficePractice;

import java.util.HashMap;
import java.util.Map;

public class HashMapExamples {
	 public static void main(String[] args) {
		
		 HashMap<String,Integer> hmap= new HashMap<String,Integer>();
		 hmap.put("bicycle", 20);
		 hmap.put("bike", 70);
		 hmap.put("motorcar", 100);
		 hmap.put("truck", 150);
		 hmap.put("plane", 700);
		 for(Map.Entry<String, Integer> iHMap: hmap.entrySet()) {
			 System.out.println(iHMap.getKey()+": "+iHMap.getValue());
			 }
		 if (hmap.containsKey("plane")) {
			 System.out.println(hmap.get("plane"));
		 	}
		 System.out.println("--------------using comute()--------------");
		 hmap.compute("plane", (k,v)->v+300);
		 for(Map.Entry<String, Integer> iHMap: hmap.entrySet()) {
			 System.out.println(iHMap.getKey()+": "+iHMap.getValue());
			 }
		System.out.println(hmap.clone()); 
		System.out.println(hmap.entrySet());
		 
		 
		 
		 
		 
		 
		 
		 
	}

}

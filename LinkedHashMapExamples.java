package myAdjnOfficePractice;

import java.util.LinkedHashMap;
import java.util.Map;

import com.sun.org.apache.bcel.internal.generic.LMUL;

public class LinkedHashMapExamples {
	public static void main(String[] args) {
		final int limit=5;
		
		LinkedHashMap<String, String> lHMap1= new LinkedHashMap<String, String>();
		lHMap1.put("Google", "www.google.com");
		lHMap1.put("Facebook", "www.facebook.com");
		lHMap1.put("Yahoo", "www.yahoo.com");
		lHMap1.put("Instagram", "www.instagram.com");
		lHMap1.put("Tweeter", "www.tweeter.com");
		System.out.println(lHMap1);
		System.out.println(lHMap1.get("Google"));
		System.out.println(lHMap1.isEmpty());
		System.out.println(lHMap1.size());
		System.out.println(lHMap1.containsKey("Facebook"));
		System.out.println(lHMap1.keySet());
		for(Map.Entry<String, String> itrLHM: lHMap1.entrySet()) {
			System.out.println(itrLHM.getKey()+" : "+ itrLHM.getValue());
		}
		
		LinkedHashMap<Integer, String> lHMap2=new LinkedHashMap<Integer, String>(){
			protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
				return size()>limit;
			}
		};
		
		lHMap2.put(1, "mango");
		lHMap2.put(2, "banana");
		lHMap2.put(3, "kiwi");
		lHMap2.put(4, "leachy");
		lHMap2.put(5, "barry");
		System.out.println(lHMap2);
		lHMap2.put(6, "orange");
		System.out.println(lHMap2);
		lHMap2.put(7, "orange");
		System.out.println(lHMap2);
	}

}

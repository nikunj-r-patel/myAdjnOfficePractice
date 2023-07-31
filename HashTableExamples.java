package myAdjnOfficePractice;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class HashTableExamples {
	public static void main(String[] args) {
		
		Hashtable<String, Integer> hTable1=new Hashtable<>();
		hTable1.put("one", 1);
		hTable1.put("two", 2);
		hTable1.put("three", 3);
		hTable1.put("four", 4);
		hTable1.put("five", 5);
		for(Map.Entry<String, Integer> e1 :hTable1.entrySet()) {
			System.out.println(e1.getKey()+" "+e1.getValue());
		}
		
		hTable1.forEach((k,v)->{v=v*100;hTable1.replace(k, v);});
		hTable1.forEach((k,v)->{System.out.println("key: "+k+"hundred"+"| value: "+v);});
		
		hTable1.computeIfAbsent("six", k-> 6);
		hTable1.forEach((k,v)->{System.out.println("key: "+k+"hundred"+"| value: "+v);});
		System.out.println("----------------------------");
		hTable1.computeIfPresent("six", (k,v)->v*100);
		hTable1.forEach((k,v)->{System.out.println("key: "+k+"| value: "+v);});
		System.out.println("-----------to get only values of map-----------------");
		Enumeration<Integer> eVal=hTable1.elements();
		while (eVal.hasMoreElements()) {
			Integer integer = (Integer) eVal.nextElement();
			
			System.out.println(integer);
		}
		System.out.println("----------------------------");
		String retVal=String.valueOf( hTable1.putIfAbsent("seven", 7));
		System.out.println(retVal);
		String retVal1=String.valueOf( hTable1.putIfAbsent("six", 6));
		System.out.println(retVal1);
		hTable1.forEach((k,v)->{System.out.println("key: "+k+"| value: "+v);});
		
		
		
	}

}

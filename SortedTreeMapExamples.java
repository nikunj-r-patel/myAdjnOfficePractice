package myAdjnOfficePractice;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedTreeMapExamples {
	public static void main(String[] args) {
		SortedMap<String, Integer> sMap1=new TreeMap<String, Integer>();
		sMap1.put("Apple", 1);
		sMap1.put("Ball", 2);
		sMap1.put("Cat", 3);
		sMap1.put("Dog", 4);
		sMap1.put("Elephant", 5);
		System.out.println(sMap1);
		for (String	 skey : sMap1.keySet()) {
			System.out.println("key: "+skey+"| value: "+sMap1.get(skey));
			
		}
		System.out.println(sMap1.tailMap("Cat"));
		System.out.println(sMap1.firstKey());
		System.out.println(sMap1.lastKey());
		Comparator comp=sMap1.comparator();
		System.out.println(comp);
		System.out.println(sMap1.entrySet());
		
		TreeMap<Integer, String> tMap1=new TreeMap<Integer, String>();
		tMap1.put(1, "Bugati");
		tMap1.put(2, "Ferari");
		tMap1.put(3, "Pagani");
		tMap1.put(4, "GT");
		tMap1.put(5, "AMG");
		System.out.println(tMap1.entrySet());
		System.out.println(tMap1.firstEntry());
		System.out.println(tMap1.firstKey());
		System.out.println(tMap1.lastEntry());
		
		TreeMap<Integer, String> tmap2=new TreeMap<Integer, String>();
		tmap2.putAll(tMap1);
		SortedMap<Integer, String> tMap_head=new TreeMap<Integer, String>();
		tMap_head=tmap2.headMap(3);
		System.out.println(tMap_head);
		System.out.println(tmap2.subMap(2, 5));
		
	}

}

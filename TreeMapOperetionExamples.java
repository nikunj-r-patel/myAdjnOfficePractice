package myAdjnOfficePractice;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapOperetionExamples {
	
	static TreeMap<Integer, String> ex_Map;
	
	static void creat() {
		ex_Map= new TreeMap<Integer, String>();
		System.out.println(" tree map created ");
		
	}
	static void insert() {
		ex_Map.put(1, "yamaha");
		ex_Map.put(3, "hero");
		ex_Map.put(2, "honda");
		ex_Map.put(4, "access");
		System.out.println(" element added in tree map ");
		
		
	}
	static void search(int key) {
		System.out.println("\n is "+key+"present?"+ex_Map.containsKey(key));
		System.out.println("\n is "+key+"has value"+ex_Map.get(key));
	}
	static void search(String value) {
		System.out.println("\n is "+value+"present?"+ex_Map.containsValue(value));
		
	}
	static void display() {
		System.out.println(ex_Map);
		
	}
	static void traverse() {
		for(Map.Entry<Integer,String> e:ex_Map.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
	}

}

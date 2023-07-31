package myAdjnOfficePractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class CountRepeatedNums {
	
	public static void main(String[] args) {
		
		int x[]= {1,2,3,4,5,4,6,5,3,8,9,4};
		ArrayList<Integer> aL=new ArrayList<Integer>();
		for (int i = 0; i < x.length; i++) {
			aL.add(x[i]);
		}
		System.out.println(aL);
		HashMap<Integer, Integer> arrHas=new HashMap<Integer, Integer>();
		for (int i = 0; i < aL.size(); i++) {
			arrHas.putIfAbsent(aL.get(i), Collections.frequency(aL, aL.get(i)));
			
		}
		System.out.println(arrHas);
		
		
		
		
		
	}

}

package myAdjnOfficePractice;

import java.util.Collections;
import java.util.TreeMap;

public class TreeMapComapartorExamples {
	public static void main(String[] args) {
		
		TreeMap<EmployeeEntity, Integer> triStd = new TreeMap<EmployeeEntity, Integer>();
		triStd.put(new EmployeeEntity(102, "nikunj", "Surat"), 1);
		triStd.put(new EmployeeEntity(103, "manish", "Gnagar"), 2);
		triStd.put(new EmployeeEntity(101, "ravi", "Abad"), 3);
		triStd.put(new EmployeeEntity(105, "tushar", "Rajkot"), 4);
		triStd.put(new EmployeeEntity(104, "sandeep", "Vadodara"), 5);
		
		System.out.println(triStd);
		
		TreeMapOperetionExamples.creat();
		TreeMapOperetionExamples.insert();
		TreeMapOperetionExamples.search(2);
		TreeMapOperetionExamples.search("honda");
		TreeMapOperetionExamples.display();
		TreeMapOperetionExamples.traverse();
		
		
		
		
	}

}

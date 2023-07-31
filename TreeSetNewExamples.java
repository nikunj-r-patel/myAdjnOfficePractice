package myAdjnOfficePractice;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetNewExamples {
	public static void main(String[] args) {
		
		TreeSet<Integer> ts1=new TreeSet<Integer>();
		ts1.add(10);
		ts1.add(20);
		ts1.add(30);
		ts1.add(40);
		ts1.add(50);
		System.out.println(ts1);
		System.out.println("the ceiling of 8: "+ts1.ceiling(8));
		System.out.println("the ceiling of 9: "+ts1.ceiling(9));
		System.out.println("the ceiling of 11: "+ts1.ceiling(11));
		System.out.println("the ceiling of 13: "+ts1.ceiling(13));
		System.out.println("the ceiling of 15: "+ts1.ceiling(15));
		System.out.println("the ceiling of 16: "+ts1.ceiling(16));
		System.out.println("the floor of 22: "+ts1.floor(22));
		System.out.println("the floor of 25: "+ts1.floor(25));
		System.out.println("the floor of 31: "+ts1.floor(31));
		
		//System.out.println(ts1.ceiling(null));//it gives nullPointer exception
		
		Iterator<Integer> itrTree1=ts1.iterator();
		itrTree1.forEachRemaining(inNo->{System.out.println(inNo+",");});
		System.out.println("---------------------in reverse-------");
		itrTree1=ts1.descendingIterator();
		itrTree1.forEachRemaining(inNo1->{System.out.println(inNo1+",");});
		
		System.out.println("---------------------in reverse-- using navigableSet and  decsendingSet -----");
		NavigableSet<Integer> traverce=ts1.descendingSet();
		
		Iterator<Integer> itrTree2= traverce.iterator();
		itrTree2.forEachRemaining(inNo1->{System.out.println(inNo1+",");});
		
		TreeSet<String> ts2=new TreeSet<String>();
		ts2.add("my");
		ts2.add("office");
		ts2.add("is");
		ts2.add("on");
		ts2.add("11");
		ts2.add("floor");
		ts2.add("of");
		ts2.add("15");
		System.out.println("the  first element is: "+ts2.first());
		System.out.println("the  last element is: "+ts2.last());
		
		System.out.println("---------------------using HeadSet on strings-------");
		TreeSet<String> tsHeadSet1=new TreeSet<String>();
		tsHeadSet1=(TreeSet<String>) ts2.headSet("on");
		tsHeadSet1.forEach(strHead->{System.out.println(strHead);});
		
		TreeSet<Integer> ts3=new TreeSet<Integer>();
		ts3.add(10);
		ts3.add(8);
		ts3.add(15);
		ts3.add(12);
		ts3.add(13);
		ts3.add(20);
		ts3.add(30);
		
		System.out.println("the number higher then 15: "+ts3.higher(15));
		System.out.println("the number higher then 20: "+ts3.higher(20));
		System.out.println("the number lower then 20: "+ts3.lower(20));
		System.out.println("the number lower then 10: "+ts3.lower(10));
		
		TreeSet<Integer> ts4=new TreeSet<Integer>(ts3);
		System.out.println("before pollingFirst: "+ts4);
		System.out.println(ts4.pollFirst());
		System.out.println("after pollingFirst: "+ts4);
		ts4.add(8);
		System.out.println("before pollinglast: "+ts4);
		System.out.println(ts4.pollLast());
		System.out.println("after pollinglast: "+ts4);
		System.out.println("---------------------using SubSet bewtween 10 and 20-------");
		TreeSet<Integer> subSet1=new TreeSet<Integer>();
		subSet1=(TreeSet<Integer>) ts4.subSet(10, 20);
		subSet1.forEach(num1->{System.out.println(num1);});
		System.out.println("---------------------using tail set after 10-------");
		TreeSet<Integer> tailSet1=new TreeSet<Integer>();
		tailSet1=(TreeSet<Integer>) ts4.tailSet(10);
		tailSet1.forEach(num2->{System.out.println(num2);});
		
	}

}

package myAdjnOfficePractice;

import java.util.Comparator;

public class CompareById implements Comparator<EmployeeEntity> {

	@Override
	public int compare(EmployeeEntity o1, EmployeeEntity o2) {
		// TODO Auto-generated method stub
		return o1.getEmpId()-o2.getEmpId();
	}

}

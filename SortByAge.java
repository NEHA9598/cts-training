package ctstraining;

import java.util.Comparator;

public class SortByAge implements Comparator<EmployeeDAOImpl> {

	@Override
	public int compare(EmployeeDAOImpl emp1, EmployeeDAOImpl emp2) {
		
		
	
			if(emp1.getAge() > emp2.getAge()) {
				return 1;}
			else if(emp1.getAge() == emp2.getAge()) {
				return 0;
				}
			else {
				return -1;
	}
			
			

	
		}}
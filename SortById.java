package ctstraining;

import java.util.Comparator;

public class SortById implements Comparator<EmployeeDAOImpl> {

	@Override
	public int compare(EmployeeDAOImpl emp1, EmployeeDAOImpl emp2) {
		
		
	
			if(emp1.getId() > emp2.getId()) {
				return 1;}
			else if(emp1.getId() == emp2.getId()) {
				return 0;
				}
			else {
				return -1;
	}
			
			

	
		}}

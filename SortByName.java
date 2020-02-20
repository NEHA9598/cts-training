package ctstraining;

import java.util.Comparator;


	public class SortByName implements Comparator<EmployeeDAOImpl> {

		@Override
		public int compare(EmployeeDAOImpl emp1, EmployeeDAOImpl emp2) {
			
			return emp1.getName().compareTo(emp2.getName());
		}
		}

	
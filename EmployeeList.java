package ctstraining;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeList {
	public static void main(String args[]) {

		ArrayList<EmployeeDAOImpl>list=new ArrayList<>();
		addEmployees(list);
		//Collections.sort(list);
		//SortById sb=new SortById();
		//addEmployees(list);
		
		//Collections.sort(list,new SortByName());
		//Collections.sort(list,new SortById());
		Collections.sort(list,new SortByAge());
		
		//SortByAge sb1=new SortByAge();
		//Collections.sort(list,sb1);
		//System.out.println(list);
	 for(EmployeeDAOImpl emp:list) {
		 System.out.println(emp);
		 }
	 
	
	}

	private static void addEmployees(ArrayList<EmployeeDAOImpl> list) {
		// TODO Auto-generated method stub
EmployeeDAOImpl emp1=new EmployeeDAOImpl(4231,"vijay","banglore","developer",20,421421.89,987867568L);
EmployeeDAOImpl emp2=new EmployeeDAOImpl(2341,"Neeraj","Mumbai","Software engg",21,23164.89,987867567L);
EmployeeDAOImpl emp3=new EmployeeDAOImpl(2321,"Sakshi","Indore","Test engg",19,45961.89,4125785652L);
EmployeeDAOImpl emp4=new EmployeeDAOImpl(4333,"Neha","Pune","developer engg",23,1000000.89,7474772653L);

list.add(emp1);
list.add(emp2);
list.add(emp3);
list.add(emp4);
}
}
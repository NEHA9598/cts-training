/*Write a program in C to separate odd and even integers in separate arrays.

Test Data : 
Input the number of elements to be stored in the array :5 
Input 5 elements in the array : 
element - 0 : 25 
element - 1 : 47 
element - 2 : 42 
element - 3 : 56 
element - 4 : 32 
Expected Output : 
The Even elements are : 
42 56 32 
The Odd elements are : 
25 47*/


package LogicalPrograms;

public class EvenOdd {
	public static void main(String args[])
	{
		int a[]={25,47,42,56,32};  
		System.out.println("Even Numbers:");  
		for(int i=0;i<a.length;i++){  
		if(a[i]%2==0){  
		System.out.println(a[i]+ "\t");  
		}  
		}  
		System.out.println("Odd Numbers:");  
		for(int i=0;i<a.length;i++){  
		if(a[i]%2!=0){  
		System.out.println(a[i]+ "\t");  
		}  
		}  
		
		} 
	}



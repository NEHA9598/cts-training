/* 1. Write a program in C to read n number of values in an array and display it in reverse order
Test Data : 
Input the number of elements to store in the array :3 
Input 3 number of elements in the array : 
element - 0 : 2 
element - 1 : 5 
element - 2 : 7 
Expected Output : 
The values store into the array are :                                                      jo bhi kar raha h, please aaram se kare .......
2 5 7 
The values store into the array in reverse are : 
7 5 2 */
package LogicalPrograms;
import java.util.*;
public class ReverseArray  {

	public static void main(String args[])
	   {
	       int size, i, j, temp;
	       int arr[] = new int[3];
	       Scanner sc = new Scanner(System.in);
	       System.out.print("Enter Array Size : ");
	       size = sc.nextInt();
	       System.out.print("The values store into the array in reverse are : ");
	       for(i=0; i<size; i++)
	       {
	           arr[i] = sc.nextInt();
	       }
	       j = i - 1;
	       i = 0;
	       while(i<j)
	       {
	           temp = arr[i];
	           arr[i] = arr[j];
	           arr[j] = temp;
	           i++;
	           j--;
	       }
	       System.out.print("Reverse of Array is : \t");
	       for(i=0; i<size; i++)
	       {
	           System.out.print(arr[i]+ "  ");
	       }
	   }
	}






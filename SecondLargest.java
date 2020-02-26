/*8. Write a program in C to find the second largest element in an array.

Test Data : 
Input the size of array : 5 
Input 5 elements in the array : 
element - 0 : 2 
element - 1 : 9 
element - 2 : 1 
element - 3 : 4 
element - 4 : 6 
Expected Output : 
The Second largest element in the array is : 6 */
package LogicalPrograms;

/*
Write a program in C to sort elements of array in ascending order.

Test Data : 
Input the size of array : 5 
Input 5 elements in the array : 
element - 0 : 2 
element - 1 : 7 
element - 2 : 4 
element - 3 : 5 
element - 4 : 9 
Expected Output : 
Elements of array in sorted ascending order: 
2 4 5 7 9 8*/

import java.util.*; 

public class SecondLargest {
	public static void main(String [] args)
	{
	int n, temp;
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter no. of elements:");
   n = sc.nextInt();
   int arr[] = new int[n];
   System.out.println("Enter all the elements:");
   for (int i = 0; i < n; i++) 
   {
       arr[i] = sc.nextInt();
   }
   for (int i = 0; i < n; i++) 
   {
       for (int j = i + 1; j < n; j++) 
       {
           if (arr[i] > arr[j]) 
           {
               temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
           }
       }
   }
   System.out.print("Second largest element:");
   
       System.out.print(arr[2]);
 
   
}
}
	


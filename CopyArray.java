/*3. Write a program in C to copy the elements of one array into another array.

Test Data : 
 Input the number of elements to be stored in the array :3 
Input 3 elements in the array : 
element - 0 : 15 
element - 1 : 10 
element - 2 : 12 
Expected Output : 
The elements stored in the first array are : 
15 10 12 
The elements copied into the second array are : 
15 10 12 */

 package LogicalPrograms;
 

public class CopyArray {

	public static void main(String args[])
	{
		int [] arr1 = new int [] {15,10,12};         
       int arr2[] = new int[arr1.length]; 
       
       for (int i = 0; i < arr1.length; i++) {     
           arr2[i] = arr1[i];     
       }       
       System.out.println("Elements of original array: ");    
       for (int i = 0; i < arr1.length; i++) {     
          System.out.print(arr1[i] + " ");    
       }        
       System.out.println();    
       System.out.println("Elements of new array: ");    
       for (int i = 0; i < arr2.length; i++) {     
          System.out.print(arr2[i] + " ");    
	}
	
}}

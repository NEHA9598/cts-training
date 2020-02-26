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
package LogicalPrograms;
import java.util.*; 

public class SortArray {
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
    System.out.print("Ascending Order:");
    for (int i = 0; i < n - 1; i++) 
    {
        System.out.print(arr[i] + ",");
    }
    System.out.print(arr[n - 1]);
}
}
	


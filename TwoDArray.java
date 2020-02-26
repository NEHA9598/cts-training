package LogicalPrograms;
import java.util.Scanner;
import java.util.*;;
public class TwoDArray 
{
	public static void main(String[] args)
	{
		Scanner sr = new Scanner(System.in);
		System.out.println("no of elements to store in the array :");
		int numEle = sr.nextInt();
		int[][] arr = new int[numEle][numEle];
		System.out.println("Input " + numEle + " no of elements in the array : ");
		for (int i = 0; i < numEle; i++) {
			System.out.println(i+1);
			for (int j = 0; j < numEle; j++) {
				System.out.println((j+1)+" element of "+(i+1)+" row is: ");
				arr[i][j] = sr.nextInt();
			}
		}
		System.out.println("values store into the array are : ");
		for (int i = 0;i <numEle; i++) {
			for (int j =0; j<numEle; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		sumRows(arr, numEle);
		sumDiagonals(arr, numEle);
		sumColumns(arr, numEle);
		divisibleBy(arr, numEle);
		sr.close();
	}
	//	 Sum of the rows
	public static void sumRows(int[][] arr, int numEle) {
		int sum = 0;
		for (int i = 0; i < numEle; i++) {
			for (int j = 0; j < numEle; j++) {
				sum =sum+ arr[i][j];
			}
			System.out.println("\nSum of "+(i+1)+" row is: "+sum);
		}
	}
//	Sum of the columns
	public static void sumColumns(int[][] arr, int numEle) {
		int sum = 0;
			for (int j = 0; j < numEle; j++) {
					sum =sum+ arr[j][0];
		}
		System.out.println("\nSum of 1st column: "+sum);
	}
//	 Sum of the diagonals 
	public static void sumDiagonals(int[][] arr, int numEle) {
		int sum = 0;
		for (int i = 0; i < numEle; i++) {
			for (int j = 0; j < numEle; j++) {
				if(i==j)
					sum =sum+ arr[i][j];
			}
		}
		System.out.println("\nSum of diagonal elements: "+sum);
	}

//	 Sum of ements divid eby 2 and 3
	public static void divisibleBy(int[][] arr, int numEle) {
		int sum = 0;
		for (int i = 0; i < numEle; i++) {
			for (int j = 0; j < numEle; j++) {
				if(arr[i][j]%2==0 && arr[i][j]%3==0)
					sum =sum+ arr[i][j];
				else
					continue;
			}
		}
		System.out.println("\nSum of elements divisible by 2 & 3 is: "+sum);
	}
}
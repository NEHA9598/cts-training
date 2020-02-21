package ctstraining;

import java.util.ArrayList;
import java.util.Scanner;
public class Series {
	public static void main(String[] args) {
		int a = 10;
		int arr1[]= {36,34,30,28,24,22,18,16,12,10};
		ArrayList<Integer> arr = new ArrayList<Integer>();
		System.out.println("Enter elements you want in series");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for(int i = 0;i <= n;i++) {
			if(i%2==0) {
				a += 2;
				arr.add(a);
			}else {
				a += 4;
				arr.add(a);
			}
		}
		for(int j = 0;j <= i;j++) {
		
		System.out.println(arr);
	}
}
package ctstraining;
//String[] input={"100","111","10100","10","1111"}
//input2="10"   
// output=2;
// count strings having prefix "10" but "10" not included in count.
import java.util.Scanner;
public class PrefixStringArr {

	public static void main(String[] args) {
	
		String num;
		Scanner sc = new Scanner(System.in);
		
		String[] str = {"100","111","10100","10","1111","10111"};
		
		System.out.println(" Enter Prefix string for search");
		num =sc.next();
		int len=str.length;
		System.out.println(len);
		int count=0;
		String num1;
		
		for( int j=0 ; j<len ;j++)
		{
			num1=str[j];
			if(num1.startsWith(num)&& !num1.equals(num))
			{
				count ++;
		
			}
		}

		System.out.println("Searched digit = " +count);
	}
		
}	
		
		
		
		
		
		
		
		
	

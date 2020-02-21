package ctstraining;

import java.util.Scanner;
class Demo
{
    
	public void sum(int ... a)
	{
	    System.out.println("The sum is :"+(a[0]+a[1]+a[2]));
	}
}
class Test
{
   public static void main(String ... args)
   
   {
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter the First Number :");
	   int x=s.nextInt();
	   System.out.println("Enter the Second Number :");
	   int y=s.nextInt();
	   System.out.println("Enter the Third Number :");
	   int z=s.nextInt();
       Demo d=new Demo();//Constructor
	   
	   d.sum(x,y,z);
   }
}